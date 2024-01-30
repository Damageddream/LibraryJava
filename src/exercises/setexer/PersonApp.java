package exercises.setexer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PersonApp {
    public static void main(String[] args) throws FileNotFoundException {
        TreeSet<Person> people = new TreeSet<>();
        String fileName = "namespl.txt";
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            people.add(new Person(sc.nextLine()));
        }
        System.out.println(people);
        System.out.println(people.size());
        System.out.println(people.first());
        System.out.println(people.last());
    }
}
