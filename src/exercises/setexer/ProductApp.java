package exercises.setexer;

import java.util.HashSet;
import java.util.Scanner;

public class ProductApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Product> products = new HashSet<>();

        boolean endProgram = false;
        while(!endProgram){
            System.out.println("Dodaj nowy produkt - 0");
            System.out.println("Koniec programu - 1");
            String choice = scanner.nextLine();
            switch (choice){
                case "0":{
                    System.out.println("Podaj nazwę: ");
                    String name = scanner.nextLine();
                    System.out.println("Podaj cenę: ");
                    int price = Integer.parseInt(scanner.nextLine());
                    Product product = new Product(name, price);
                    if(products.contains(product)){
                        System.out.println("Produkt już w bazie, co chcesz zrobć?");
                        System.out.println("Nadpisz produkt - 0");
                        System.out.println("Zignoruj nowy artykuł - 1");
                        String choice2 = scanner.nextLine();
                        if(choice2.equals("0")){
                            products.remove(product);
                            products.add(product);
                        }
                    } else {
                        products.add(product);
                    }
                    break;
                }
                case "1": {
                    System.out.println(products);
                    endProgram = true;
                    break;
                }
                default: {
                    System.out.println("Nieporawna opcja, spróbuj ponownie");
                    break;
                }
            }

        }

    }

}
