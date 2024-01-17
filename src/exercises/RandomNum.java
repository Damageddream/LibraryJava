package exercises;
import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(9999);;
        System.out.println(randomInt);
        if(randomInt > 5000){
            System.out.println("Losowa liczba jest większa niż 5000");
        } else if (randomInt < 5000) {
            System.out.println("Losowa liczba jest mniejszą niż 5000");
        }else {
            System.out.println("Losowa liczba jest równa 5000");
        }

        if(randomInt%2==0){
            System.out.println("Losowa liczba jest parzysta");
        }else {
            System.out.println("Losowa liczba jest nieparzysta");
        }

        ManipulateNum manNum = new ManipulateNum();
        int finalNum = manNum.manipulateNum(randomInt);
        System.out.println("final number is "+finalNum);




    }
}
