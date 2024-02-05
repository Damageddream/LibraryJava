package exercises.repetition.dziedzicz;

public class Course {
    private String id;
    private double price;
    private String describtion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    public Course(String id, double price, String describtion) {
        this.id = id;
        this.price = price;
        this.describtion = describtion;
    }
}
