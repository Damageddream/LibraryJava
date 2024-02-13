package exercises.finalrep.listss;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SumNums {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Podaj liczbę do zsumowania" +
                "jeśli chcesz wyjść wpisz exit");
        boolean working = true;
        int summation = 0;
        ArrayList<Integer> nums = new ArrayList<>();
        do{
            System.out.println("Podaj liczbę lub wpisz exit: ");
            try{
               String out = sc.nextLine();
               if(out.toLowerCase().trim().equals("exit")){
                   for (Integer num : nums) {
                        summation += num;

                   }
                   System.out.println("Suma liczb to "+summation);
                   System.out.println("Program zakończył działanie");
                   working = false;
               } else {
                   try{
                     int number = Integer.parseInt(out);
                     nums.add(number);
                   }catch(NumberFormatException e){
                       System.out.println("Nie prowadzono liczby");
                   }
               }
            } catch (InputMismatchException e){
                System.out.println("Błędne wprowadzenie, wprowadź liczbę");
            }
        } while(working);
    }
}
