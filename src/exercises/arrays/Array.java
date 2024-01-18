package exercises.arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int[] numbers2 = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        int sumOfNumber = numbers[0] + numbers[1] + numbers[2];
        numbers2[0] = 4;
        numbers2[1] = 5;
        numbers2[2] = 6;
        int sumOfNumbers2 = numbers2[0] + numbers2[1] + numbers2[2];
        int sumsOfArrays = sumOfNumber + sumOfNumbers2;
        System.out.println(sumsOfArrays);
        SummingNums sumNums = new SummingNums();
        System.out.println(sumNums.summingNums(numbers, numbers2));

    }
}
