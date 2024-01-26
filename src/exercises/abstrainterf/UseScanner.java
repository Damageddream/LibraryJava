package exercises.abstrainterf;

import java.util.Scanner;

public class UseScanner {
    Scanner scanner = new Scanner(System.in);
    public String scanText(){
        return scanner.nextLine();
    }
    public double scantDouble(){
     return scanner.nextDouble();
    }

}
