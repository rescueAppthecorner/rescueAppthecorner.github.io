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

function login(){
    conectBack("get"); 
    json = promise.then(response => response.json());
    json.then(data => {
      console.log(data)
      for (let i = 0; i < data.length; i++) {
        addCourseHTML(data[i].id, data[i].name, data[i].duration, data[i].description, "cursos");
    }});
}

function conectBack(accion){
    const uri = "http://localhost:8080/dist";
      const promise = fetch(uri, {
        method: accion,
        mode: "cors", // no-cors, *cors, same-origin
        cache: "no-cache", // *default, no-cache, reload, force-cache, only-if-cached
        credentials: "omit", // include, *same-origin, omit
        headers: {
          "Content-Type": "application/json",
        },
      });
}
