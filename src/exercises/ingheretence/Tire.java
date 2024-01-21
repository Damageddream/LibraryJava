package exercises.ingheretence;

public class Tire extends Part {
    private double size;
    private double width;

    public Tire(double size, double width) {
        this.size = size;
        this.width = width;
        setProducentName("asd");
        setSeriesNr(1);
        setId(2);
        setModel("weq");
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
