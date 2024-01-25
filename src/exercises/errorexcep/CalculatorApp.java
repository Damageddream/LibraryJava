package exercises.errorexcep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = 0;
        double b = 0;
        String operator = null;
        boolean takingData = true;
        while (takingData) {
            try{
                System.out.println("Podany pierwszą liczbę");
                a = input.nextDouble();
                input.nextLine();
                System.out.println("Podaj operator (+, -, *, /)");
                operator = input.nextLine();
                System.out.println("Podany drugą liczbę");
                b = input.nextDouble();
                takingData = false;
            }catch(InputMismatchException e){
                System.out.println("Wprowadzono nieporpawne dane");
                input.nextLine();
            }
        }


        CalculatorLogic calc = new CalculatorLogic();
        try{
            double result = calc.calculate(a, b, operator);
            System.out.println(a + operator + b + " = " + result);
        } catch(ArithmeticException e){
            System.out.println("Nie można dzielić przez 0");
        } catch(UnknownOperatorException e){
            System.out.println("Nie ma takiego operatora");
        }



        input.close();
    }
}
