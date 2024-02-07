package exercises.repetition.arrayss;

import java.util.Objects;

public class Building implements Comparable<Building> {
    private String city;
    private Integer price;
    private Integer square;

    private double pricePerSq;

    public Building(String city, Integer price, Integer square) {
        this.city = city;
        this.price = price;
        this.square = square;
        this.pricePerSq =price/square;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(city, building.city) && Objects.equals(price, building.price) && Objects.equals(square, building.square) && Objects.equals(pricePerSq, building.pricePerSq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, price, square, pricePerSq);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSquare() {
        return square;
    }

    public void setSquare(Integer square) {
        this.square = square;
    }

    public double getPricePerSq() {
        return pricePerSq;
    }

    public void setPricePerSq(double pricePerSq) {
        this.pricePerSq = pricePerSq;
    }

    @Override
    public int compareTo(Building o) {
        return Double.compare(pricePerSq, o.getPricePerSq());
    }

    @Override
    public String toString() {
        return "Building{" +
                "city='" + city + '\'' +
                ", price=" + price +
                ", square=" + square +
                ", pricePerSq=" + pricePerSq +
                '}';
    }
}
