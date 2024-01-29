package exercises.bigints;

import java.util.Scanner;

public class BigInts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Poda dowolny tekst z liczbami i cyframi: ");
        String text = sc.nextLine();
        int biggest = 0;
        int nrOfChar = 0;
        int nrOfInts = 0;
        for(int i=0; i < text.length(); i++){
            char a = text.charAt(i);
            if(Character.isDigit(a)){
                nrOfInts++;
                if(Character.getNumericValue(a) > biggest){
                    biggest = Character.getNumericValue(a);
                }
            } else if(Character.isLetter(a)){
                nrOfChar++;
            }
        }
        System.out.println("Liczba cyfr w tekście to: "+nrOfInts);
        System.out.println("Liczba znaków w tekście to: "+nrOfChar);
        if(nrOfInts > 0){
            System.out.println("Największa cyfra to: "+biggest);
        }else{
            System.out.println("Brak cyfr w tekście");
        }
    }
}
