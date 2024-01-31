package exercises.mapsexer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductController  {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "products.txt";
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        sc.nextLine();
        HashMap<String, Category> allCategories = new HashMap<>();
        while (sc.hasNextLine()){
            String[] line = sc.nextLine().split(";");
            String cat = line[0];
            String name = line[1];
            int price = Integer.parseInt(line[2]);
            Product product = new Product(cat, name, price);
            if(allCategories.get(cat) == null){
                Category category = new Category();
                category.addProduct(product);
                allCategories.put(cat, category);
            }else{
                Category category = allCategories.get(cat);
                category.addProduct(product);
            }

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kategorię ");
        String chosenCategory = scanner.nextLine();
        filterCategory(allCategories, chosenCategory);


    }
    public static void filterCategory(HashMap<String ,Category> categoryHashMap, String category){
        Category filteredCat = categoryHashMap.get(category);
        Product lowesPriceProduct = filteredCat.getProducts().get(0);;
        Product highestPriceProduct = filteredCat.getProducts().get(0);
        int total = 0;
        int numbersOfProducts = filteredCat.getProducts().size();
        for (Product product : filteredCat.getProducts()) {
            System.out.println(product);
            total += product.getPrice();
            if(product.getPrice() > highestPriceProduct.getPrice()){
                highestPriceProduct = product;
            }
            if(product.getPrice() < lowesPriceProduct.getPrice()){
                lowesPriceProduct = product;
            }
        }
        double avrPrice = total/numbersOfProducts;
        System.out.println("Średnia cena produktów: "+avrPrice);
        System.out.println("Najtańszy produkt: "+lowesPriceProduct);
        System.out.println("Najdroższy produkt: "+highestPriceProduct);

    }


}
