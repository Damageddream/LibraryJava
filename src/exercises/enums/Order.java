package exercises.enums;

public class Order {
    private Item item;
    private Status status;


    public Order(Item item, Status status) {
        this.item = item;
        this.status = status;
    }

    @Override
    public String toString() {
        return item.getName()+" ("+item.getPrice()+"zł) "
                +"- "+status.getDescribtion();
    }

    public Status getStatus() {
        return status;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

}
