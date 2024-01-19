package exercises.loops;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperaturę aktualną: ");
        double actTemp = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj temperaturę docelową: ");
        double targetTemp = scanner.nextInt();
        while(actTemp != targetTemp){
            if(actTemp > targetTemp){
                actTemp -= 0.5;
            } else {
                actTemp += 0.5;
            }
            System.out.println("Aktualna temperatura "+actTemp);
        }
        System.out.println("Osiągnięto temperaturę docelową "+actTemp);

    }
}
