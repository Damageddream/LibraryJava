package exercises.stringex.bilder;

import java.util.Random;
import java.util.Scanner;

public class dice {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wciśnij enter aby rzucić kostką");
        scanner.nextLine();
        int rand = random.nextInt(6) + 1;
        String dice = switch (rand) {
            case 1: {
                yield """
                         -----------
                        |           |
                        |     0     |
                        |           |
                         -----------                          
                        """;
            }
            case 2: {
                yield """
                         -----------
                        |       0  | 
                        |          |
                        |   0      |
                         -----------                          
                        """;
            }
            case 3: {
                yield """
                         -----------
                        |       0  | 
                        |     0    |
                        |   0      |
                         -----------                          
                        """;
            }
            case 4: {
                yield """
                         -----------
                        |  0    0   | 
                        |           |
                        |  0    0   |
                         -----------                          
                        """;
            }
            case 5:{
                yield """
                         -----------
                        |  0    0   | 
                        |     0     |
                        |  0    0   |
                         -----------                          
                        """;
        }
        case 6:{
            yield """
                         -----------
                        |  0    0   | 
                        |  0    0   |
                        |  0    0   |
                         -----------                          
                        """;
        }
            default:{
            yield null;}
        };
        System.out.println(dice);
    }
}
