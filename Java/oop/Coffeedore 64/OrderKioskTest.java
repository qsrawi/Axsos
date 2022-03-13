public class OrderKioskTest {
    public static void main(String[] args) {
        OrderKiosk order = new OrderKiosk();
        Item item1 = new Item("Coffee",2);
        Item item2 = new Item("Tea",1.5);
        Item item3 = new Item("Mocha",0.5);
        Item item4 = new Item("Milk",3);

        order.addMenuItem(item1);
        order.addMenuItem(item2);
        order.addMenuItem(item3);
        order.addMenuItem(item4);

        order.newOrder();
    }
}
