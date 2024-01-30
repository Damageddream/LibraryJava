package exercises.comapres;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class CompFile {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "price.txt";
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        scanner.nextLine();
        Building[] buildings = new Building[10];
        int buildLen = 0;
        while (scanner.hasNextLine()){
            String i = scanner.nextLine();
            String[] splitted = i.split(";");
            String city = splitted[0];
            int area = Integer.parseInt(splitted[1]);
            int square = Integer.parseInt(splitted[2]);
            Building building = new Building(city, area, square);
            buildings[buildLen] = building;
            buildLen++;
        }
        Arrays.sort(buildings);
        System.out.println(Arrays.toString(buildings));
    }
}
