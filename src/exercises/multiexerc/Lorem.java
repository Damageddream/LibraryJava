package exercises.multiexerc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lorem {
    public static void main(String[] args) {
        String filanName = "lorem.txt";
        try( var fileReader = new FileReader(filanName);
        var reader = new BufferedReader(fileReader);){
            Stream<String> lines = reader.lines();
            ArrayList<IntStream> filteredLines = lines.map(x -> x.chars().filter(y -> y == '.' || y == ',')).collect(Collectors.toCollection(ArrayList::new));
            Stream.of(filteredLines).map(x - > x.to).forEach(System.out::println);

        } catch(IOException e) {
            e.getCause();
        }
    }
}
