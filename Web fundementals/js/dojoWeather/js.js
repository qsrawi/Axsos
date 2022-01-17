function city(e){
    alert("Loading weather report ( " + e.innerHTML+" ).........")
}

function removeCookie(e){
    e.parentElement.remove();
}

var higher1=document.querySelector(".higher1");
var higher2=document.querySelector(".higher2");
var higher3=document.querySelector(".higher3");
var higher4=document.querySelector(".higher4");

var lower1=document.querySelector(".lower1");
var lower2=document.querySelector(".lower2");
var lower3=document.querySelector(".lower3");
var lower4=document.querySelector(".lower4");

function chooseTempreture(e) {
    if(e.value=="f") {
     higher1.innerHTML =Math.floor((higher1.innerHTML * 1.8) + 32); 
     higher2.innerHTML = Math.floor((higher2.innerHTML * 1.8) + 32);
     higher3.innerHTML = Math.floor((higher3.innerHTML * 1.8) + 32);
     higher4.innerHTML = Math.floor((higher4.innerHTML * 1.8) + 32);

     lower1.innerHTML = Math.floor((lower1.innerHTML * 1.8) + 32);
     lower2.innerHTML = Math.floor((lower2.innerHTML * 1.8) + 32);
     lower3.innerHTML = Math.floor((lower3.innerHTML * 1.8) + 32);
     lower4.innerHTML = Math.floor((lower4.innerHTML * 1.8) + 32);
    }
    if(e.value=="c"){
        higher1.innerHTML =Math.floor((higher1.innerHTML - 31) * .5556); 
        higher2.innerHTML = Math.floor((higher2.innerHTML  - 31) * .5556); 
        higher3.innerHTML = Math.floor((higher3.innerHTML  - 31) * .5556); 
        higher4.innerHTML = Math.floor((higher4.innerHTML  - 31) * .5556); 
        lower1.innerHTML = Math.floor((lower1.innerHTML  - 31) * .5556); 
        lower2.innerHTML = Math.floor((lower2.innerHTML  - 31) * .5556); 
        lower3.innerHTML = Math.floor((lower3.innerHTML  - 31) * .5556); 
        lower4.innerHTML = Math.floor((lower4.innerHTML  - 31) * .5556); 
    }

}



