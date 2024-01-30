package exercises.array;

import java.util.Arrays;

public class CompareTexts {
    public static boolean compare(String a, String b){
        if(a == null && b == null) {
            return true;
        } else if((a == null && b != null) || (a != null && b == null)){
            return false;
        }
        String upperA = a.toUpperCase();
        String upperB = b.toUpperCase();

        char[] arrA = upperA.toCharArray();
        char[] arrB = upperB.toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);

        if(Arrays.equals(arrA,arrB)){
            return true;
        }
        return false;
    }
}
