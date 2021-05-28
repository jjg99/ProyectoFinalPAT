function sendChallenge(event){
    event.preventDefault();
    let difficulty = document.getElementById("difficulty").value;
    let solution = document.getElementById("solution_challenge").value;
    let name = document.getElementById("name_challenge").value;
    let description = document.getElementById("description").value;
    let files_to_upload = document.getElementById("challenge_files").files
    let files = {number:0}
    files.number=files_to_upload.length
    for (let index = 0; index < files_to_upload.length; index++) {
        files["file"+index]= files_to_upload[index].name;
    }
    let data = {
        "files" : JSON.stringify(files),
        "solution": solution
    }

    let challenge = {
        'difficulty' : difficulty,
        'username' : "j0nan", ////////////////////////////////////////////////////////////////////////////////////////////////////////
        'data' : JSON.stringify(data),
        'name' : name,
        'description' : description
    }
    console.warn(challenge)

    fetch('../challenges/new', 
    {
        method : 'POST',
        headers : {
            'Content-Type' : 'application/json',
            'Accept' : 'application/json'
        },
        body : JSON.stringify(challenge)
    })
    .then(response => {
        if(response.ok) {
            console.log(response)
            return response.json()
        } else {
            alert("Error en la subida")
            console.error(response)
        }
    }).then( res => {
        sendFile(res);
        alert("Desafio creado con exito");
        window.location.replace("/");
    }).catch(error => console.error(error))
}

function sendFile(challenge) {
    //https://www.devglan.com/spring-boot/spring-boot-file-upload-download
    let files = document.getElementById("challenge_files").files
    let formData = new FormData();
    for (let index = 0; index < files.length; index++) {
        formData.append('files', files[index]);
    }
 
    fetch("../files/upload/"+challenge.id, 
    {
        method : 'POST',
        body : formData
    })
    .then(response => {
        if(response.ok) {
            console.log("Archivos subidos correctamente")
        } else {
            alert("Subida de archivos a fallado, pongase en contacto con el administrador. Disculpe las molestias.")
            console.error(response)
        }
    }).catch(error => console.error(error))
}
