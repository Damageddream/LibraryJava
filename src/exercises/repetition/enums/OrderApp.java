package exercises.repetition.enums;

public class OrderApp {
    public static void main(String[] args) {
        Order[] orders = {
                new Order("one", Status.DELIVERED),
                new Order("two", Status.CANCELLED),
                new Order("three", Status.PAID),
                new Order("four", Status.DELIVERED),
        };

    }
    static Order[] filteredOrders(Order[] orders, Status status){
        Order[] filteredOrders = new Order[orders.length];
        int filteredOrdersLength = 0;
        for (int i = 0; i < orders.length; i++) {
            if(orders[i].getStatus().getName().equals(status.getName())){
                filteredOrders[filteredOrdersLength] = orders[i];
                filteredOrdersLength++;
            }
        }
        return filteredOrders;
    }
}
