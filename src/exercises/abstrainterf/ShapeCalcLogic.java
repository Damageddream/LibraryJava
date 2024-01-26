package exercises.abstrainterf;

import java.util.NoSuchElementException;

public class ShapeCalcLogic {
    UseScanner us = new UseScanner();

    private String getShape() {
        System.out.println("Z jakiego kształtu będziemy korzyśtaC? "
                + "Kwadrat, Koło, Trójkąt");
        return us.scanText();
    }

    private String getCalc() {
        System.out.println("Co będziemy liczyć? Obwód, Pole");
        us.scanText();
        String text = us.scanText();
        return text;
    }

    private double getEdge() {
        System.out.println("Podaj długość boku: ");
        return us.scantDouble();
    }

    private Shape createShape() {
        String shape = getShape();
        Shape newShape = switch (shape) {
            case "Kwadrat" -> {
                double edge = getEdge();
                us.scanText();
                double edge2 = getEdge();
                yield new Rectangle(edge, edge2);
            }
            case "Trójkąt" -> {
                double edge = getEdge();
                us.scanText();
                double edge2 = getEdge();
                us.scanText();
                double edge3 = getEdge();
                yield new Triangle(edge, edge2, edge3);

            }
            case "Koło" -> {
                System.out.println("Podaj promień");
                double r = us.scantDouble();
                yield new Circle(r);
            }
            default -> throw new NoSuchElementException();
        };
        return newShape;
    }

    private double calculateShape(Shape shape) {
        String calc = getCalc();
        double calculated = switch (calc) {
            case "Pole" -> shape.calculateArea();
            case "Obwód" -> shape.calculatePerimeter();
            default -> throw new NoSuchElementException();
        };

        return calculated;
    }

    public double start() {
        Shape shape = createShape();
        return calculateShape(shape);
    }

}
