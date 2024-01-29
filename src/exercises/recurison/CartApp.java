package exercises.recurison;

public class CartApp {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(0);
        double total = cart.totalCost(0);
        System.out.println(total);
    }
}
