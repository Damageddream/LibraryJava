package exercises.abstrainterf;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class ShapeCalculator {
    public static void main(String[] args) {
        ShapeCalcLogic shapeCalcLogic = new ShapeCalcLogic();
        boolean finished = false;

        while(!finished){
            try{
                double caculated = shapeCalcLogic.start();
                System.out.println(caculated);
                finished = true;
            } catch(InputMismatchException e){
                System.out.println("Wprowadziłeś nieporawne dane");
            } catch(NoSuchElementException e){
                System.out.println("Wybrany indentyfiaktor jest nirporpawny");
            }
        }





    }
}
