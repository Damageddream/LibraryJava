package exercises.enums;

public class ShopInitate {

    private OrderLogic orderLogic;
    Item apple = new Item("Appl MacBook", 3000);
    Item adapter = new Item("Adapter - HDMI", 150);
    Item samsung = new Item("Samsung Galaxy", 2000);
    Item mouse = new Item("Logitech pro", 400);
    Item headphones = new Item ("Xrazors", 600);

    Order order1 = new Order(apple, Status.NEW);
    Order order2 = new Order(adapter, Status.PAID);
    Order order3 = new Order(samsung, Status.CANCELLED);
    Order order4 = new Order(mouse, Status.NEW);
    Order order5 = new Order(headphones, Status.CANCELLED);
    ShopInitate(){
        orderLogic = new OrderLogic();
    }
    public OrderLogic initiate(){
        this.orderLogic.addOrder(order1);
        this.orderLogic.addOrder(order2);
        this.orderLogic.addOrder(order3);
        this.orderLogic.addOrder(order4);
        this.orderLogic.addOrder(order5);
        return orderLogic;
    }

}
