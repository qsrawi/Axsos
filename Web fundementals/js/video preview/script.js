var x = document.getElementById("myVideo"); 
var y=document.getElementById("play");
var z=document.getElementById("mute");
function playVid(){
    if(x.paused==true){
        x.play(); 
        y.innerHTML="Pause"
    }
    else{x.pause();
    y.innerHTML="play";
    }
}

