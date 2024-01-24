package exercises.enums;

import java.util.Scanner;

public class ShopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShopInitate shopInitate = new ShopInitate();
        OrderLogic orderLogic = shopInitate.initiate();
        Order[] allOrders = orderLogic.getOrders();
        System.out.println("Zamówienia z jakim statusem chcesz odszukać? ");
        Status[] statuses = Status.values();
        for (Status status : statuses) {
            System.out.println(status.getDescribtion());
        }
        String choice = scanner.nextLine();
        Status chosenStatus = Status.fromDescribtion(choice);
        Order[] filtered = orderLogic.filterOrders(allOrders, chosenStatus);
        System.out.println("Lista zamówień ze statusem "+chosenStatus.getDescribtion());
        for (int i = 0; i < filtered.length; i++) {
            if(filtered[i]!=null){
                System.out.println(filtered[i].toString());
            }
        }
    }
}
