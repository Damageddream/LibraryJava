package exercises.repetition.exceptions;

import java.util.Scanner;

public class CaclulatorApp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Signs sing = getSing();
        double a = getNum();
        double b = getNum();
        double result = Calculator.makeCaluclation(sing, a, b);
        System.out.println("Wynik to "+result);


    }
    private static Signs getSing(){
        boolean looping = true;
        Signs sing = null;
        do{
            System.out.println("Jakie działanei chcesz wykonać? +, -, /, *");
            String sign = sc.nextLine();
            try{
                sing = Signs.getByDescribtion(sign);
                looping = false;

            } catch (UnknownOperatorException e){
                e.getMessage();
            }
        } while(looping);

        return sing;
    }
    private static double getNum(){
        double num = 0;
        while(true){
            System.out.println("Podaj liczbę: ");
            try{
                num = sc.nextDouble();
                sc.nextLine();
                break;
            } catch (IllegalArgumentException e){
                e.getMessage();
            }
        }
        return num;

    }
}
