package exercises.comapres;

public class Building implements Comparable<Building> {
    private String city;
    private int area;
    private int squareFoot;
    private double pricePerSquare;

    @Override
    public String toString() {
        return "Building{" +
                "city='" + city + '\'' +
                ", area=" + area +
                ", squareFoot=" + squareFoot +
                ", pricePerSquare=" + pricePerSquare +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public Building(String city, int area, int squareFoot) {
        this.city = city;
        this.area = area;
        this.squareFoot = squareFoot;
        this.pricePerSquare = this.area/this.squareFoot;
    }

    public double getPricePerSquare() {
        return pricePerSquare;
    }

    public void setPricePerSquare(double pricePerSquare) {
        this.pricePerSquare = pricePerSquare;
    }

    @Override
    public int compareTo(Building o) {
        if(pricePerSquare > o.getPricePerSquare()){
            return 1;
        } else if (pricePerSquare < o.getPricePerSquare()) {
            return -1;
        }
        return 0;

    }
}
