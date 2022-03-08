package OrderandItems;

import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    ArrayList<Item> items=new ArrayList<Item>();
    //Empty Constructor 
    public Order(){
        this.name = "Guest";
    }
    // Constructor 
    public Order(String name){
        this.name = name;
    }
    //Seters And getters
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setready(boolean ready){
        this.ready = ready;
    }
    public boolean isReady(){
        return ready;
    }
    //Actoin Methods
    public void addItem(Item item){
        items.add(item);
    }
    public String getStatusMessage(){
        if (this.ready ==true){
            return ("Your order is ready");
        }
        else{
            return ("Thank you for waiting. Your order will be ready soon.");
        }
    }
    public void display(){
        double total = 0;
        System.out.printf("Customer Name: %s\n", this.name);
        for(Item item :items){
            System.out.println(item.getName() +"  --  "+item.getPrice() +" $");
            total =total + item.getPrice();
        }
        System.out.printf("Total is: %s\n", total);
    }
    public double getOrderTotal(){
        double total = 0;
        for(Item item :items){
            total =total + item.getPrice();
        }
        return total;
    }
    
}
