package zooKeeper;

public class Gorilla extends Mammal {

		public void throwSomthing() {
			System.out.println("i throw some thing");
			super.energyLevel -=10;}
	
		public void eateBannana() {
			System.out.println("i eate bann");
			super.energyLevel +=10;
		}
		public void climb() {
			System.out.println("i climed");
			super.energyLevel -=5;
		
	}
	
}
