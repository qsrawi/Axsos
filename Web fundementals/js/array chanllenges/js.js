//Always Hungry

function alwaysHungry(arr) {
    var newarr=[]
    for(var i=0;i<arr.length;i++){
        if(arr[i] == "food")
            newarr.push("Yummy")
    }
    if (newarr.length > 0)
    console.log(newarr);
    else 
    console.log("I'm hungry");
}


alwaysHungry([3.14, "food", "pie", true, "food"]);

alwaysHungry([4, 1, 5, 7, 2]);

//High Pass Filter

function highPass(arr, cutoff) {
    var filteredArr = [];
    for(var i=0;i<arr.length;i++)
    {
        if(arr[i] > cutoff)
        filteredArr.push(arr[i]);
    }
    return filteredArr;
}
var result = highPass([6, 8, 3, 10, -2, 5, 9], 5);
console.log(result);

//Better than average

function betterThanAverage(arr) {
    var sum = 0;
    var avg = 1;
    for(var i=0;i<arr.length;i++){
        sum +=arr[i];
    }
    avg = sum / arr.length; 
    var count = 0
    for(var i=0;i<arr.length;i++){
        if(arr[i] > avg)
        count ++;
        }
        return count;
}
var result = betterThanAverage([6, 8, 3, 10, -2, 5, 9]);
console.log(result);

//Array Reverse

function reverse(arr) {
    var temp = [];
    for(var i = arr.length-1; i >= 0; i--){
        temp.push(arr[i])
    }
    arr = temp;
    return arr;
}
var result = reverse(["a", "b", "c", "d", "e"]);
console.log(result); // we expect back ["e", "d", "c", "b", "a"]

//Fibonacci Array

function fibonacciArray(n) {
    var fibArr = [0, 1];
    while( fibArr.length != n-1){
        fibArr.push(fibArr[fibArr.length-1] + fibArr[fibArr.length-2]);
        }
        return fibArr
    }
var result = fibonacciArray(11);
console.log(result); // we expect back [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]