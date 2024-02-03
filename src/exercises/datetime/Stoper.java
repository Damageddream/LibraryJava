package exercises.datetime;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stoper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Aby rozpoczac pomiar - Enter");
        sc.nextLine();
        Instant start = Instant.now();
        System.out.println("Aby zatrzymać pomiar - Enter");
        sc.nextLine();
        Instant finish = Instant.now();
        Duration between = Duration.between(start, finish);
        System.out.println("mineło: "+between.getSeconds()+"s");


    }
}
