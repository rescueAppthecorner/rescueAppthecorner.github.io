/*!
    * Start Bootstrap - SB Admin v7.0.5 (https://startbootstrap.com/template/sb-admin)
    * Copyright 2013-2022 Start Bootstrap
    * Licensed under MIT (https://github.com/StartBootstrap/startbootstrap-sb-admin/blob/master/LICENSE)
    */
    // 
// Scripts
// 

window.addEventListener('DOMContentLoaded', event => {

    // Toggle the side navigation
    const sidebarToggle = document.body.querySelector('#sidebarToggle');
    if (sidebarToggle) {
        // Uncomment Below to persist sidebar toggle between refreshes
        if (localStorage.getItem('sb|sidebar-toggle') === 'true') {
            document.body.classList.toggle('sb-sidenav-toggled');
        }
        
        sidebarToggle.addEventListener('click', event => {
            event.preventDefault();
            document.body.classList.toggle('sb-sidenav-toggled');
            localStorage.setItem('sb|sidebar-toggle', document.body.classList.contains('sb-sidenav-toggled'));
        });
    }
});

async function login(){

    profile = {
        email: document.getElementById("inputEmail").value, 
        passw: document.getElementById("inputPassword").value
    };
    

    conectBack("post", `http://localhost:8080/login`, profile); 
}

async function principal(){

    parameters = {
        modooculto: document.getElementById("modooculto").value, 
        mascara: document.getElementById("mascara").value,
        numeroemergencia: document.getElementById("numeroemergencia").value,
        fotosvictima: document.getElementById("fotosvictima").value,
        fotosagresor: document.getElementById("fotosagresor").value,
        paginaderviar: document.getElementById("paginaderviar").value,
    };
    

    conectBack("post", `http://localhost:8080/principal`, parameters); 
}

function conectBack(accion, uri, datos){
    console.log(datos.modooculto)
    console.log(datos.mascara)
    const promise = fetch(uri, {
      method: accion,
      mode: "cors", // no-cors, *cors, same-origin
      cache: "no-cache", // *default, no-cache, reload, force-cache, only-if-cached
      credentials: "omit", // include, *same-origin, omit
      headers: {"Content-Type": "application/json",}, 
      body: JSON.stringify(datos)
    });
    t=promise.then((r) => r.text());

    t.then((data) => {
        console.log("data=" + data)
        
        //Sentencia negada para pruebas
        if(data=="concedido"){
            console.log("entramos") 
            document.location.href="dist/principal.html";
            return;
        }

        alert("El correo o la contraseña es incorrecto");
    })

}
