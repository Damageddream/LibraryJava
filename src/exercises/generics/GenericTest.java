package exercises.generics;

public class GenericTest {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Wow", 2);
        Pair<Character, Double> pair2 = new Pair<>('a', 2.2);
        Pair<Double, String> pair3 = new Pair<>(2.2, "Kol");

        Pair.printInfo(pair2.getFirst(), pair2.getSecond());
        Pair.printInfo(pair.getFirst(), pair.getSecond());
        Pair.printInfo(pair3.getFirst(), pair3.getSecond());

    }
}
