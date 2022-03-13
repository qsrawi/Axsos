package zooKeeper;

public class Gorilla extends Mammal {

		public void throwSomthing() {
			System.out.println("I will throw some thing");
			super.energyLevel -=10;}
	
		public void eatBananas() {
			System.out.println("I eat Banana");
			super.energyLevel +=10;
		}
		public void climb() {
			System.out.println("I climbed");
			super.energyLevel -=5;
		
	}
	
}
