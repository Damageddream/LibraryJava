package exercises.repetition.listss;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UserSummation {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        boolean working = true;
        do{
            System.out.println("Podaj liczbę: ");
            try{
                int num = sc.nextInt();
                if(num>0 && num%5==0){
                    numbers.add(num);
                }else{
                    working = false;
                }
                sc.nextLine();
            }catch(InputMismatchException e)
            {
                System.out.println("Wporwadzono zły paramentr, spróbuj jeszcze raz");
            }
        }while(working);
        System.out.println("ilość poprawnie wprowadzonych liczbe to: "+numbers.size());
        System.out.println("Suma wszystkich poprawnych liczb to"+sum(numbers));
        System.out.println("Średnia porpawnych liczb to"+(sum(numbers)/numbers.size()));

    }
    static int sum(List<Integer> list){
        int sum = 0;
        for (Integer i : list) {
            if(i instanceof Integer){
                sum+= i;
            }
        }
        return sum;
    }
}
