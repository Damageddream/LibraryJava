package exercises.repetition.methodrefers;

import java.util.*;

public class MethorRef {
    public static void main(String[] args) {
        List<String> names = List.of("Mar", "Ada", "Wer", "Bar");
        Collections.sort(names, String::compareToIgnoreCase);
    }
}
