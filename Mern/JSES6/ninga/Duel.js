class Card {
    constructor(name, cost) {
      this.name = name;
      this.cost = cost;
    }
  }
  
  class Unit extends Card {
    constructor(name, cost, power, res) {
      super(name, cost);
      this.power = power;
      this.res = res;
    }
  
    displayStats() {
      console.log(`Power: ${this.power}, Resilience: ${this.res}`);
    }
  
    attack(target) {
      if (target instanceof Unit) {
        target.res -= this.power;
      } else {
        throw new Error("Target must be a unit!");
      }
    }
  }
  
  class Effect extends Card {
    constructor(name, cost, text, stat, magnitude) {
      super(name, cost);
      this.text = text;
      this.stat = stat;
      this.magnitude = magnitude;
    }
  
    play(target) {
      if (target instanceof Unit) {
        if (this.stat == "resilience") {
          target.res += this.magnitude;
        } else if (this.stat == "power") {
          target.power += this.magnitude;
        }
      } else {
        throw new Error("Target must be a unit!");
      }
    }
  }
  
  const Red_Belt_Ninja = new Unit("Red Belt Ninja", 3, 3, 4);
  const Black_Belt_Ninja = new Unit("Black Belt Ninja", 4, 5, 4);
  
  const Hard_Algorithm = new Effect(
    "Hard Algorithm",
    2,
    "increase target's resilience by 3",
    "resilience",
    3
  );
  
  const Unhandled_Promise_Rejection = new Effect(
    "Unhandled Promise Rejection",
    1,
    "reduce target's resilience by 2",
    "resilience",
    -2
  );
  
  const Pair_Programming = new Effect(
    "Pair Programming",
    3,
    "increase target's power by 2",
    "power",
    2
  );
  
  Red_Belt_Ninja.displayStats();
  Hard_Algorithm.play(Red_Belt_Ninja);
  Red_Belt_Ninja.displayStats();
  Unhandled_Promise_Rejection.play(Red_Belt_Ninja);
  Red_Belt_Ninja.displayStats();
  Pair_Programming.play(Red_Belt_Ninja);
  Red_Belt_Ninja.displayStats();
  Black_Belt_Ninja.displayStats();
  Red_Belt_Ninja.attack(Black_Belt_Ninja);
  Black_Belt_Ninja.displayStats();