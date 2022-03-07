import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal(){
        int sum=0;
        for (int i=1;i<=10;i++){
            sum +=i;
        }
        return sum;
        }

    public double getOrderTotal(double[] prices){
        double total=0.0;
        for (double i : prices){
            total +=i;
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for (int i=0;i< menuItems.size();i++){
            System.out.println(i + "  " +menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello  " + userName);
        String oldCustomers ="";
        System.out.println("These are the ones in front of you");
        for (String name :customers){
            oldCustomers =oldCustomers + name +"  " ;
        }
        System.out.println(oldCustomers);
        System.out.println("New List :");
        customers.add(userName);
        for (String name :customers){
            System.out.println(name);
        }
    }
}