class Ninja{
    constructor(name,health){
        this.name = name;
        this.health=health;
        this.speed =3;
        this.strength =3;
    }
    sayName(){
        console.log(this.name);
    }
    showStats(){
        const message= `the state of this ninga is name : 
        ${this.name} health : ${this.health}
        speed : ${this.speed}
        strength : ${this.strength}`;
        console.log(message)
    }
    rinkSake(){
        this.health +=10
    }
}

const ninja1 = new Ninja("Hyabusa",15);
ninja1.sayName();
ninja1.showStats();
ninja1.rinkSake();
ninja1.showStats();