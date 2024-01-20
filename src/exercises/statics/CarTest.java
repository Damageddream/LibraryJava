package exercises.statics;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car(10, true, true, false, false);
        car.ingition();
        System.out.println(car.status());
        car.setKlapkaClosed(true);
        car.setDoorsClosed(true);
        System.out.println(car.status());
        car.setFuelLevel(0);
        System.out.println(car.status());

    }
}
