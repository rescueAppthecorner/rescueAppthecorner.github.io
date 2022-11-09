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
        //if (localStorage.getItem('sb|sidebar-toggle') === 'true') {
            //document.body.classList.toggle('sb-sidenav-toggled');
        //}
        sidebarToggle.addEventListener('click', event => {
            event.preventDefault();
            document.body.classList.toggle('sb-sidenav-toggled');
            localStorage.setItem('sb|sidebar-toggle', document.body.classList.contains('sb-sidenav-toggled'));
        });
    }
});

async function login(){
    in_email = document.getElementById("inputEmail").value;
    in_pass = document.getElementById("inputPassword").value;

    profile = {email: in_email, pass: in_pass};

    conectBack("post", `http://localhost:8080/login`, profile); 
}

function conectBack(accion, uri, datos){
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
        
        if(data!="concedido"){
            console.log("entramos") 
            document.location.href="principal.html"
        }
        else{
            console.log("no entramos") 
        }
        
    })

}
