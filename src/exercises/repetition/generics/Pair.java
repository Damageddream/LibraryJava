package exercises.repetition.generics;

public class Pair <T,V>{
    private T one;
    private V second;

    @Override
    public String toString() {
        return "Pair{" +
                "one=" + one +
                ", second=" + second +
                '}';
    }

    public Pair(T one, V second) {
        this.one = one;
        this.second = second;
    }

    public T getOne() {
        return one;
    }

    public void setOne(T one) {
        this.one = one;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }
}
