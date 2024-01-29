package exercises.bigints;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        String filename = "nums.txt";
        File file = new File(filename);
        int counter = 0;

        try {
            Scanner sc = new Scanner(file);
            int small = 0;
            BigInteger bigInteger = new BigInteger("0");
            while(sc.hasNextLine()){
                String num = sc.nextLine();
                if(counter <= 2){
                    small += Integer.parseInt(num);
                } else {
                    bigInteger = bigInteger.add(new BigInteger(num));
                }
                counter++;
            }
            System.out.println(small);
            System.out.println(bigInteger);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
