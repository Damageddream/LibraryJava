package exercises.enums;

public class OrderLogic {

    private static final int MAX_ORDERS = 5;
    private Order[] orders = new Order[MAX_ORDERS];
    private int quantity = 0;

    public void addOrder(Order order){
        orders[quantity] = order;
        quantity++;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }
    public Order[] filterOrders(Order[] orders, Status status){
      Order[] filtered = new Order[orders.length];
        for (int i = 0; i < orders.length; i++) {
            if(orders[i].getStatus().getDescribtion().equals(
                    status.getDescribtion()
            )){
                filtered[i] = orders[i];
            }
        }
        return  filtered;
    };
}
