package exercises.scanner;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        double a = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Wybierz +,-,*,/");
        String sign = scanner.nextLine();
        System.out.println("Podaj drugą liczbę");
        double b = scanner.nextDouble();
        scanner.close();
        CalculatorLogic calculatorLogic = new CalculatorLogic();
        String result = calculatorLogic.calculate(a,b,sign);
        System.out.println(result);

    }
}
