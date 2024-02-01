package exercises.collects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoApp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        lotto.generate();
        lotto.randomize();
        List<Integer> userNumbers = new ArrayList<>();
        for(int i = 0; i < 6; i++){
            System.out.println("Podaj liczbę: ");
            int number = sc.nextInt();
            sc.nextLine();
            userNumbers.add(number);
        }
        System.out.println("Wynik losowania: "+lotto.getShuffeled());
        System.out.println("Liczby uczestnika: "+userNumbers);
        System.out.println("Liczba trafień: "+lotto.checkResult(userNumbers));

    }
}
