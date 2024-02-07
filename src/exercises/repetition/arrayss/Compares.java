package exercises.repetition.arrayss;

import java.util.Arrays;
import java.util.Comparator;

public class Compares {
    public static void main(String[] args) {
        Integer[] numbers = {1,4,2,5,1,2,5,83,4567, 12, -12, 32, 0, 1};
        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });
        System.out.println(Arrays.toString(numbers));
    }
}
