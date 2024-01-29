package exercises.recurison;

public class Recurs {
    public static void main(String[] args) {
        System.out.println();
        int number = silnia(5);
        System.out.println(number);
    }
    static public int silnia(int a){
        return  a > 1 ? a * silnia((a-1)) : 1;
    }
}
