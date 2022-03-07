import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {
        CafeUtil cafe1=new CafeUtil();

        int streak=cafe1.getStreakGoal();
        System.out.println(streak);

        double [] myArray =new double[4];
        myArray[0]=3;
        myArray[1]=4;
        myArray[2]=6;
        double totalPrice=cafe1.getOrderTotal(myArray);
        System.out.println(totalPrice);

        ArrayList<String> manu = new ArrayList<String>();
        manu.add("drip coffee" );
        manu.add("cappuccino" );
        manu.add("mocha" );
        cafe1.displayMenu(manu);

        ArrayList<String> customers = new ArrayList<String>();
        customers.add("Oday");
        customers.add("Ahmad");
        customers.add("Omer");
        cafe1.addCustomer(customers);
    }
}
