package exercises.finalrep;

import exercises.arrays.Array;

import java.util.*;

public class Exerc {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Mar",20));
        people.add(new Person("Woj",15));
        people.add(new Person("Woj",32));

        people.sort(Comparator.comparingInt(Person::getAge));
        System.out.println(people);
        people.forEach(x->{

        });
        ArrayList<String> names = new ArrayList<>();
        names.add("Koler");
        names.add("Loler");
        names.add("Molwe");
        names.add("Aler");
        List<Integer> nums = new ArrayList<>();
        names.forEach(x->nums.add(x.length()));
        System.out.println(nums);
        String name = "Woro";
        String[] split = name.split("");
        for (String s : split) {
            System.out.println(s);
        }
        List<String> asd = List.of("asd","qew");
        asd.stream().map(x->x.substring(0,1)+x).
        nums.stream().filter(num -> num%5==0).forEach(System.out::println);
        nums.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        });
    }

}
