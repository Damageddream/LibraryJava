package exercises.Cars.Exercise1;
import exercises.Cars.Exercise1.Controller.PointController;
import exercises.Cars.Exercise1.Point.Point;
import java.util.Scanner;

public class PointApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz opcje: 0 - przesuń punkt o 1x, 1 - przesuń punkt o 1y, 2 przesuń punkt o -1x," +
                " 3 przesuń punkt o -1y ");
        String option = scanner.nextLine();
        Point point = new Point(2,3);
        PointController pointControlelr = new PointController();
        System.out.println(point.getX() + " "+point.getY());

        String moved = switch (option) {
            case "0" -> {
                pointControlelr.addX(point);
                yield "Dodano x";
            }
            case  "1" -> {
                pointControlelr.addY(point);
                yield "Dodano y";
            }
            case "2" -> {
                pointControlelr.minusX(point);
                yield "Odjęto x";
            }
            case "3" -> {
                pointControlelr.minusY(point);
                yield "Odjęto y";
            }

            default -> "Opcja nieznana";
        };

        System.out.println(moved + "Współrzędne punktu: " +point.getY()+" "+point.getX());


    }
}
