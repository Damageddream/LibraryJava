package exercises.comapres;

import java.util.Arrays;
import java.util.Comparator;

public class Comp {
    public static void main(String[] args) {
        Integer[] tab = {69, -66, -50, -63, -34, 51, 90, -21, -37, 46, -44, -51, -69, 30, 32, 12, 41, 98, 77, -84};
        System.out.println(Arrays.toString(tab));
        System.out.println();
        Arrays.sort(tab, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(tab));
        Arrays.sort(tab, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(tab));

    }
}
