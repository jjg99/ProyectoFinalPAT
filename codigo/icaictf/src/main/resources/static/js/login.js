function validateForm(event) {
    event.preventDefault()
    try {
        var usuario = document.getElementById("userInput").value;
        var contr = document.getElementById("passwordInput").value;
        const data = { username: usuario, password: contr };
        const address = '/api/login';
        fetch(address, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(data)
            })
            .then(response => response.json())
            .then(data => {
                console.log(data);
                if (typeof data.jwttoken !== 'undefined') {
                    console.log("Authenticated");
                    //window.Cookies.set('token', data.jwttoken)
                    document.cookie = "token="+data.jwttoken;
                    document.cookie = ""
                    window.location.replace("/home/"+usuario)

                } else {
                    alert("Credential not recognized");
                    showModal("Credencial no reconocida");
                }
            });

    } catch (err) {
        console.error(err.message);
    }
    return false;
}

function showModal(response) {
    html = '<p>Código de error: '+response.status+'</p>';
    // html += '<p>Mensaje: '+response.errors[0].json().defaultMessage+'<p>';
    console.log(response)
    document.getElementById("modal-text").innerHTML=html;
}