//Function 1 remove request on click
var request=document.querySelector(".sidenav1 .headerblack button")
var conncetion=document.querySelector(".sidenav2 .headerblack button")

function accept(e) {
    e.parentElement.parentElement.remove();
    request.innerText--;
    conncetion.innerHTML++;

}
function close(e) {
    e.parentElement.parentElement.remove();
    request.innerText--;
}
//Function 2 Change the name on click
var name1 = document.querySelector(".usercard H1")
function changeName() {
    name1.innerHTML= "Oday Qasrawi";
}
