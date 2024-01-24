package exercises.stringex.bilder;

import java.util.Scanner;

public class exer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile wyrazów chcesz wprowadzić? ");
        int nr = scanner.nextInt();
        scanner.nextLine();
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < nr; i++){
            System.out.println("Wprowadź wyraz: ");
            String word = scanner.nextLine();
            builder.append(word.charAt(word.length()-1));
        }
        System.out.println(builder);
    }
}
