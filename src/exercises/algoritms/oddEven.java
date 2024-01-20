package exercises.algoritms;

import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("Podaj liczbę ");
            num = sc.nextInt();
            sum += num;
        } while (num < 100);

        if(sum %2 ==0){
            System.out.println("Liczba parzysta");
        }else {
            System.out.println("Liczba nieparzysta");
        }
    }
}
