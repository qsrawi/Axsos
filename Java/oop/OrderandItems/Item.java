package OrderandItems;
public class Item {

    private String name;
    private double price; 
    //Constructor
    public Item (String name,double price){
        this.name=name;
        this.price=price;
    }
    //Empty Constructor
    public Item (){
    }
    //Setters And Getters
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return this.price;
    }
}
