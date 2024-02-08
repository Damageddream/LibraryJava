package exercises.repetition.LAMBAS;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Testing {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Supplier<Integer> sup = () -> random.nextInt(100);
            numbers.add(sup.get());
        }
        Consumer<Integer> prinNums = System.out::println;
        numbers.forEach(prinNums);
        List<Integer> filteredNums = filter(numbers, x -> x%2==0);
        System.out.println(filteredNums);

    }
    static <T> List<T> filter(List<T> nums, Predicate<T> pred){
        List<T> filteredList = new ArrayList<>();
        Iterator<T> iterator = nums.iterator();
        while (iterator.hasNext()){
            T next = iterator.next();
            if(pred.test(next)){
                filteredList.add(next);
            }

        }
        return filteredList;
    }
}
