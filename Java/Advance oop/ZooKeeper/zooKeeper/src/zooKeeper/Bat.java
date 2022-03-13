package zooKeeper;

public class Bat extends Mammal {
	public void fly() {
		System.out.println("the sound a bat taking off");
		super.energyLevel -=50;
		
	}
	public void eatHumans() {
		System.out.println("the so- well, never mind");
		super.energyLevel +=25;
	}
	public void attackTown() {
		System.out.println("the sound of a town on fire");
		super.energyLevel -=100;
	}
}
