package exercises.lambexerc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class lambExerc {
    public static Random random = new Random();

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Supplier<Integer> randomNums = () -> random.nextInt(10);

        for (int i = 0; i < 10; i++){
            nums.add(randomNums.get());
        }
        Consumer<List<Integer>> printNums = list -> {
            for (Integer i : list) {
                System.out.print(i+" ");
            }
        };
        printNums.accept(nums);
        System.out.println();
        ArrayList<Integer> filtered = filterList(nums, x -> x%2 != 0);
        printNums.accept(filtered);


    }
    public static <E> ArrayList<E> filterList(ArrayList<E> list, Predicate<E> pred){
          Iterator<E> iter = list.iterator();
          ArrayList<E> filteredList = new ArrayList<>();
          while (iter.hasNext()){
              E i = iter.next();
              if(pred.test(i)){
                  filteredList.add(i);
              }

          }
          return filteredList;

    }

}
