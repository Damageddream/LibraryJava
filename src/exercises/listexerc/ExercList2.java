package exercises.listexerc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercList2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ints = new ArrayList<>();
        while(true){
            try{
                System.out.println("Podaj kolejną liczbę nieujamną, podzielną przez 5: ");
                String line = scanner.nextLine();
                int num = Integer.parseInt(line);
                if(num%5 == 0 && num > -1){
                    ints.add(num);
                } else {
                    break;
                }

            }catch(NumberFormatException e){
                System.out.println("Musi zostać wprowadzona liczba. ");
            }
        }
        System.out.println("Ile poprawnych liczba: "+ints.size());
        System.out.println(sumAndAvr(ints));

    }
    public static String sumAndAvr(List<Integer> list){
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        int avr = sum/list.size();
        return "Suma to: "+sum+" \n średnia to: "+ avr;
    }

}
