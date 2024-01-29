package exercises.recurison;

import java.util.Scanner;

public class Cart {

    private static final int MAX_PRODUCTS = 10;
    private Product[] products;


    Scanner scan = new Scanner(System.in);

    public Cart() {
        this.products = new Product[MAX_PRODUCTS];

    }
    public int add(int len){
        if(len < MAX_PRODUCTS){
            Product product = createProduct();
            products[len] = product;
            return add(len+1);
        }
        return 0;
    }
    private Product createProduct(){
        System.out.println("Podaj nazwę produktu: ");
        String name = scan.nextLine();
        System.out.println("Podaj cenę produktu: ");
        double price = scan.nextDouble();
        scan.nextLine();
        return new Product(name, price);
    }
    public double totalCost(int len){
        if(len < MAX_PRODUCTS){
            return products[len].getPrice() + totalCost(len+1);

        }
        return 0;
    }


}
