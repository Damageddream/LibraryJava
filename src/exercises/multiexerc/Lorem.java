package exercises.multiexerc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lorem {
    public static void main(String[] args) {
        String filanName = "lorem.txt";
        try (var fileReader = new FileReader(filanName);
             var reader = new BufferedReader(fileReader);) {
            Stream<String> lines = reader.lines();

            List<String> collect = lines.map(line -> line
                            .chars()
                            .filter(c -> c != '.' && c != ',')
                            .mapToObj(c -> String.valueOf((char) c))
                            .collect(Collectors.joining())
                    )
                    .toList();
            String[] s = collect.get(0).split(" ");
            List<String> list = Arrays.stream(s).toList();
            System.out.println(list);
            List<String> sStarted = Arrays.stream(s).filter(x -> x.charAt(0) == 's').toList();
            List<String> fiveLength = Arrays.stream(s).filter(x -> x.length() == 5).toList();

            System.out.println("liczba słów rozpoczynających się na s:" + sStarted.size());
            System.out.println("liczba słów 5 literowych:" + fiveLength.size());


        } catch (IOException e) {
            e.getCause();
        }
    }
}
