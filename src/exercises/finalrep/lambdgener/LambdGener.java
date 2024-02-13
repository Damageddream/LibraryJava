package exercises.finalrep.lambdgener;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdGener {
    public static void main(String[] args) {
        Random random = new Random();
        Supplier<Integer> ranNum = () -> random.nextInt(100);
        List<Integer> numbers = new ArrayList<>();
        Consumer<Integer> prinNume = x -> System.out.println(x);
        for(int i = 0; i < 10; i++){
            int num = ranNum.get();
            prinNume.accept(num);
            numbers.add(num);
        }
        Predicate<Integer> filter = x -> !(x%2 == 0);
        List<Integer> filteredList = new ArrayList<>();
        for (Integer number : numbers) {
            if(filter.test(number)){
                filteredList.add(number);
            }
        }
        System.out.println(filteredList);

    }
}
