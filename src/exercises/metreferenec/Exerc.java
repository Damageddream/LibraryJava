package exercises.metreferenec;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exerc {
    public static void main(String[] args) {
        String[] names = {"Ewa", "Ala", "Marcin", "Bartosz", "Żaneta"};
        List<String> namesList = Arrays.asList(names);
        namesList.sort(String::compareToIgnoreCase);
        System.out.println(namesList);

    }
}
