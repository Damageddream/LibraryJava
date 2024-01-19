package exercises.loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile liczb chcesz zsumować?");
        int numberOfLoops = scanner.nextInt();
        int result = 0;
        while(numberOfLoops-- > 0){
            System.out.println(numberOfLoops);
            System.out.println("Podaj kolejną liczbę");
            result += scanner.nextInt();
        }
        System.out.println("Suma liczba to "+result);
    }
}
