function print_odd(){
    for(var i=1;i<=20;i++){
        if(i%2 !=0)
        console.log(i)
    }
}
console.log("Odds numbers from 1-20"+print_odd());
function multiples_3(){
    for(var i=100;i>=0;i--){
        if(i%3 ==0)
        console.log(i)
    }
}
console.log("Decreasing Multiples 3 from 100- 0"+multiples_3());
function sequance(sequance_start,sequance_end){
    var text=[];
    for(var i=sequance_start;i>=sequance_end;i -=1.5){
        text.push(i);
    }
    console.log(text);
}
sequance(10,-8);
function sigma(){
    var sum=0;
    for(var i=1;i<=100;i++){
        sum +=i;
    }
    console.log(sum)
}
sigma();
function factorial(){
    var mult=1;
    for(var i=1;i<=12;i++){
        mult *=i;
    }
    console.log(mult)
}
factorial();