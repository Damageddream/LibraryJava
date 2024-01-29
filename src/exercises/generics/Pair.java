package exercises.generics;

public class Pair <T,V>{
    private T first;
    private V second;

    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }
    public static <T,V> void printInfo(T a, V b){
        System.out.println("Argument "+a+" "+a.getClass());
        System.out.println("Argument "+b+" "+b.getClass());
    }

}
