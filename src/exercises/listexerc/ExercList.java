package exercises.listexerc;

import java.util.Scanner;

public class ExercList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczby do zsumowania, wpisze 'exit' gdy chcesz zakończyć: ");
        sum(sc);
        System.out.println(info);

    }
    public static int summation = 0;
    public static String info = "";
    public static int sum(Scanner sc){
        System.out.println("Podaj liczę: ");
        String option  = sc.nextLine();
        if(option.toLowerCase().equals("exit")){
            info +=" = "+summation;
            return summation;
        }
        try{
            int a = Integer.parseInt(option);
            summation += a;
            info += " + "+option;
        }catch(NumberFormatException e){
            System.out.println("Nieprawidłowy format liczby");
        }
        return sum(sc);
    }
}
