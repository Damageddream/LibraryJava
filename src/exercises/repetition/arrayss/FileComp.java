package exercises.repetition.arrayss;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FileComp {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "price.txt";
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        Building[] buildings = new Building[10];
        int buildingsLen = 0;

        sc.nextLine();
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            String[] splitted = line.split(";");
            Building building = new Building(splitted[0], Integer.parseInt(splitted[1]), Integer.parseInt(splitted[2]));
            buildings[buildingsLen] = building;
            buildingsLen++;
        }
        Arrays.sort(buildings);
        System.out.println(Arrays.toString(buildings));
    }

}
