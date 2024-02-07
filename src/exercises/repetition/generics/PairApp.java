package exercises.repetition.generics;

public class PairApp {
    public static void main(String[] args) {
        Pair<String, Double> pair1 = new Pair<>("one", 2.2);
        Pair<Integer, Boolean> pair2 =new Pair<>(1, true);
        Pair<Character, String> pair3 = new Pair<>('a', "Was");

      printInfo(pair1);
      printInfo(pair2);
      printInfo(pair3);
    }
    public static <T,V> void printInfo(Pair<T,V> pair){
        System.out.println(pair);
    }
}
