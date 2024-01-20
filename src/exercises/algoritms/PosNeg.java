package exercises.algoritms;

import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args) {
        int multi = 1;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.println("Podaj liczbę ");
            multi *= sc.nextInt();
        }
        if(multi >= 0){
            System.out.println("nieujemna");
        } else {
            System.out.println("ujemna");
        }
    }
}
