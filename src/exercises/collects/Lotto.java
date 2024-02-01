package exercises.collects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lotto {
    private ArrayList<Integer> numbers;
    private List<Integer> shuffeled;

    public List<Integer> getShuffeled() {
        return shuffeled;
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public Lotto() {
        this.numbers = new ArrayList<>();
    }
    public void generate(){
        for(int i = 1; i < 50; i++){
            numbers.add(i);
        }
    }
    public  void randomize(){
        Collections.shuffle(numbers);
        shuffeled = numbers.subList(0, 6);

    }
    public int checkResult(List<Integer> cupon){
        int correctNumbers = 0;
        for (int i = 0; i < 6; i++){
            if(shuffeled.contains(cupon.get(i))){
                correctNumbers++;
            }
        }
        return correctNumbers;
    }
}
