package exercises.repetition.dziedzicz;

public class Stationary extends Course{
    private String city;
    private int nrOfClasses;

    public Stationary(String id, double price, String describtion, String city, int nrOfClasses) {
        super(id, price, describtion);
        this.city = city;
        this.nrOfClasses = nrOfClasses;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNrOfClasses() {
        return nrOfClasses;
    }

    public void setNrOfClasses(int nrOfClasses) {
        this.nrOfClasses = nrOfClasses;
    }
}
