package exercises.array;

import java.util.Scanner;

public class CompareApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź 1 szy tekst: ");
        String a = sc.nextLine();
        System.out.println("Wprwadź 2gi tekst: ");
        String b = sc.nextLine();
        System.out.println(CompareTexts.compare(a,b));
    }
}
