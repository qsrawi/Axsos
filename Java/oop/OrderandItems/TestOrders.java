package OrderandItems;

import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
        Item item1 = new Item("mocha",2);
        Item item2 = new Item("latte",4);
        Item item3 = new Item("drip coffee",1.5);
        Item item4 = new Item("capuccino",2.5);
        Order order1 =new Order();
        order1.addItem(item1);
        order1.addItem(item2);
        System.out.println(order1.getStatusMessage());
        order1.display();


        // Order order2 =new Order("Khaled");
        // Order order3 =new Order("Mona");
        // Order order4 =new Order("Donya");
        // order2.items.add(item1);
        // order2.total +=item1.price;
        // order3.items.add(item4);
        // order3.total +=item4.price;
        // order4.items.add(item2);
        // order4.total +=item2.price;
        // order1.ready=true;
        // order1.total +=item3.price;
        // order2.items.add(item2);
        // order2.items.add(item2);
        // order2.total +=item2.price;
        // order2.total +=item2.price;
        // order4.ready=true;
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
        // System.out.printf("_________________________________\n");
        // System.out.printf("Name: %s\n", order2.name);
        // System.out.printf("Total: %s\n", order2.total);
        // System.out.printf("Ready: %s\n", order2.ready);
        // System.out.printf("_________________________________\n");
        // System.out.printf("Name: %s\n", order3.name);
        // System.out.printf("Total: %s\n", order3.total);
        // System.out.printf("Ready: %s\n", order3.ready);
        // System.out.printf("_________________________________\n");
        // System.out.printf("Name: %s\n", order4.name);
        // System.out.printf("Total: %s\n", order4.total);
        // System.out.printf("Ready: %s\n", order4.ready);
        // System.out.printf("_________________________________\n");
        // System.out.printf("Name: %s\n", order4.items.get(0).name);
    }
}