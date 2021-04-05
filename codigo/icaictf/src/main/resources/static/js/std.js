function load_navbar(active) {
    html  ='<nav class="navbar navbar-expand-lg navbar-dark bg-dark">'
    html += '<div class="container-fluid">';
    html += '<a class="navbar-brand" href="/">';
    html +=     '<img src="https://img.icons8.com/wired/128/hacker.png" class="image-fluid logo-navbar"></img>';
    html +=     '<b class="titulo-navbar">ICAI - Catch The Flag</b></a>';
    html += '</a>';
    html += '<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">';
    html +=     '<span class="navbar-toggler-icon"></span>';
    html += '</button>';
    html += '<div class="collapse navbar-collapse" id="navbarNavAltMarkup">';
    html += '<div class="navbar-nav flex-row flex-wrap">';

    // Opcion Inicio
    html +='<a class="nav-link ';
    if (active=='Inicio') {
        html += 'active ';
    }
    html += 'col-6 col-lg-auto" aria-current="page" href="/">Inicio</a>';

    // Opcion Podio
    html +='<a class="nav-link ';
    if (active=='Podio') {
        html += 'active ';
    }
    html += 'col-6 col-lg-auto" aria-current="page" href="/podio">Podio</a>';

    // Opcion Desafios
    html +='<a class="nav-link ';
    if (active=='Desafios') {
        html += 'active ';
    }
    html += 'col-6 col-lg-auto" aria-current="page" href="#">Desafíos</a>';

    // Opcion Sobre nosotors
    html +='<a class="nav-link ';
    if (active=='Sobre nosotros') {
        html += 'active ';
    }
    html += 'col-6 col-lg-auto" aria-current="page" href="/sobre_nosotros.html?sobre_nosotros">Sobre nosotros</a>';

    html +='        </div>';
    html +=         '<hr class="d-lg-none text-white-50">';
    html +=         '<div class="d-flex ms-auto flex-row flex-wrap" id=btn-navbar-user>';
    html +=             '<button type="button" class="btn btn-outline-light col-12 col-lg-auto" id="btn-login" onclick="location.href=\'login.html\';">Iniciar Sesión</button>';
    html +=         '</div>';
    html +=     '</div>';
    html += '</div>';
    html +='</nav>';

    document.getElementById("navbar").innerHTML = html;
}

function load_footer() {
    html  = '<footer class="bg-dark">';
    html +=     '<div class="container-fluid">';
    html +=         '<span class="text-muted"><a href="./sobre_nosotros.html?contacto">Contacto</a></span>';
    html +=     '</div>';
    html += '</footer>';

    document.getElementById("footer").innerHTML = html;
}

function cambiar_header_usuario(nombre) {
    html   = '<img src="https://img.icons8.com/wired/128/anonymous-mask.png" class="image-fluid user-navbar"></img>'
    html  += '<button type="button" class="btn btn-outline-danger col-12 col-lg-auto">Cerrar Sesión</button>';

    document.getElementById("btn-navbar-user").innerHTML = html;
}