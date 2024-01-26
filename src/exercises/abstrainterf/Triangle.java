package exercises.abstrainterf;

public class Triangle implements Shape {
    private double firstEdge;
    private double secondEdge;
    private double thirdEdge;

    public Triangle(double firstEdge, double secondEdge, double thirdEdge) {
        this.firstEdge = firstEdge;
        this.secondEdge = secondEdge;
        this.thirdEdge = thirdEdge;
    }

    public double getFirstEdge() {
        return firstEdge;
    }

    public void setFirstEdge(int firstEdge) {
        this.firstEdge = firstEdge;
    }

    public double getSecondEdge() {
        return secondEdge;
    }

    public void setSecondEdge(int secondEdge) {
        this.secondEdge = secondEdge;
    }

    public double getThirdEdge() {
        return thirdEdge;
    }

    public void setThirdEdge(int thirdEdge) {
        this.thirdEdge = thirdEdge;
    }

    @Override
    public double calculateArea() {
        double s = (firstEdge + secondEdge + thirdEdge) / 2.0;
        return Math.sqrt(s * (s - firstEdge) * (s - secondEdge) * (s - thirdEdge));
    }

    @Override
    public double calculatePerimeter() {
        return firstEdge + secondEdge + thirdEdge;
    }
}
