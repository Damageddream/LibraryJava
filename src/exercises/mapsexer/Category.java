package exercises.mapsexer;

import java.util.ArrayList;
import java.util.Objects;

public class Category {
    private String name;
    private ArrayList<Product> products;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(name, category.name) && Objects.equals(products, category.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, products);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public Category() {

        this.products = new ArrayList<>();

    }
    public void addProduct(Product product) {
        products.add(product);
    }


}
