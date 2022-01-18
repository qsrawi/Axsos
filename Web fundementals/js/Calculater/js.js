var displayDiv = document.querySelector("#display");
function press(e){
    var check= 0;
    if(displayDiv.innerText.length > 6){
        alert("you reach to the maximum value,,you can empty the string")
        check ++;
    }
    if(check == 0){
    displayDiv.innerText +=e;}
}

function setOP(e){
    var check=0
    for(i = 0; i < displayDiv.innerText.length; i++){
        if(displayDiv.innerText[i] == '/' || displayDiv.innerText[i] == '*' || displayDiv.innerText[i] == '+'  || displayDiv.innerText[i] == '-'){
        alert("you already enter an operation");
        check ++;
        break;
        }
    } 
    if(check == 0){
        displayDiv.innerText +=e;
    }        
}
function calculate(){
    var x = displayDiv.innerText;
    var y = eval(x);
    displayDiv.innerText = y;
}

function clr(){
    displayDiv.innerText="";
}