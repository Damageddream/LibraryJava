package exercises.stringex.bilder;

import java.util.Scanner;

public class LowerUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź dowolny teskt: ");
        String line = scanner.nextLine();
        char first = line.trim().charAt(0);

        if(Character.isUpperCase(first)){
            System.out.println(line.toUpperCase());
        } else if(Character.isLowerCase(first)){
            System.out.println(line.toLowerCase());
        } else {
            System.out.println(line);
        }



    }
}
