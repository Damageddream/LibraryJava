package exercises.repetition.listss;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class NameSet {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "namespl.txt";
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        TreeSet<String> names = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -(o1.compareTo(o2));
            }
        });
        while (sc.hasNextLine()){
            names.add(sc.nextLine());
        }
        System.out.println(names.toString());
        System.out.println(names.size());
        System.out.println(names.first());
        System.out.println(names.last());




    }
}
