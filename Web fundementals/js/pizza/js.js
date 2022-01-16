function pizzaOven(crustType, sauceType, cheese, toppings) {
    var sandwich = {};
    sandwich.crustType = crustType;
    sandwich.sauceType = sauceType;
    sandwich.cheese = cheese;
    sandwich.toppings = toppings;
    return sandwich;
}
    
var Pizza1 = pizzaOven("deep dish", "traditional", "mozzarella", ["pepperoni", "sausage"]);
console.log(Pizza1);

var Pizza2 = pizzaOven("hand tossed", "marinara", ["mozzarella", "feta"], ["mushrooms", "olives", "onions"]);
console.log(Pizza2);

var crustType=["deep dish","hand tossed"];
var sauceType=["traditional","marinara"];
var cheese=["mozzarella","feta"];
var toppings=["pepperoni","mushrooms","sausage", "olives"]
function randomPizza(crustType, sauceType, cheese, toppings) {
    var sandwich = {};
    sandwich.crustType = crustType[Math.floor(Math.random()*crustType.length)];
    sandwich.sauceType = sauceType[Math.floor(Math.random()*sauceType.length)];
    sandwich.cheese = cheese[Math.floor(Math.random()*cheese.length)];;
    sandwich.toppings = toppings[Math.floor(Math.random()*toppings.length)];;
    return sandwich;
}
var Pizzarandom = randomPizza(crustType, sauceType, cheese, toppings);
console.log(Pizzarandom);