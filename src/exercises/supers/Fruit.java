package exercises.supers;

public class Fruit {
    private int weight;
    private String type;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Fruit(int weight, String type) {
        this.weight = weight;
        this.type = type;
    }
    public String getInfo(){
        return "Waga owoce: "+getWeight()+" Typ owocu: "+getType();
    }
}
