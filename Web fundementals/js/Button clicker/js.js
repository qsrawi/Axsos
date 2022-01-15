function login(e){
    var txt="Logout";
    if(e.innerHTML==txt)
    e.innerHTML="Login"
    else
    e.innerHTML="Logout";
}

function deleted(e){
    e.parentNode.removeChild(e);
}

function liked(e){
    alert("Ninja was clicked");
    var r=e.childNodes[0];
    r.innerHTML++;
}