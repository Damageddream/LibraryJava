package exercises.scanner;

import java.util.Random;

public class CoinLogic {
    private int flipCoin(){
        Random random = new Random();
        return random.nextInt(2);
    }
    public String checkPrediction(int a){
        int flip = flipCoin();
        if(flip == 0 &&  a == 0){
            return "Brawo, wypadła reszka wygrałeś";
        } else if (flip == 1 && a == 1) {
            return "Brawo, wypadł orzeł wygrałeś";
        }
        else{
            return "Niestety, przegrałeś";
        }
    }
}
