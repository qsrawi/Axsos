package zooKeeper;

public class BatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bat bat=new Bat();
		bat.attackTown();
		bat.eatHumans();
		bat.eatHumans();
		bat.eatHumans();
		bat.fly();
		System.out.println(bat.displayEnergy());
	}

}
