package exercises.repetition.methodrefers;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExercOne {
    public static void main(String[] args) {
       Stream.iterate(0,x->x+1)
                .filter(x->x>100 && x<1000 && x%5==0)
                .limit(10)
                .map(x->x*3)
                .forEach(System.out::println);
    }
}
