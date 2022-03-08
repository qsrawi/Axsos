package OrderandItems;

import java.util.ArrayList;

public class Order {
    public String name;
    public double total;
    public boolean ready;
    ArrayList<Item> items=new ArrayList<Item>();
    public Order(String name){
        this.name = name;
    }
}
