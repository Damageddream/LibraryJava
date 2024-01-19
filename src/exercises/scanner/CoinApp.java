package exercises.scanner;

import java.util.Scanner;

public class CoinApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz jedną z opcji\n1 - orzeł" +
                "\n0 - reszka");

        int choice = scanner.nextInt();
        scanner.nextLine();
        CoinLogic coinLogic = new CoinLogic();
        System.out.println(coinLogic.checkPrediction(choice));
        
    }
}
