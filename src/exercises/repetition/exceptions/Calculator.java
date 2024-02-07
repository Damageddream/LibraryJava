package exercises.repetition.exceptions;

public class Calculator {
    public static double add(double a, double b){
        return a+b;
    }
    public static double decrement(double a, double b){
        return a-b;
    }
    public static double division(double a, double b){
        if(b == 0){
            throw  new ArithmeticException("Nie można podzielić przez 0");
        }
        return a/b;
    }
    public static double multiplication(double a, double b){
        return a*b;
    }

    public static double makeCaluclation(Signs sign, double a, double b){
        return switch(sign){
            case PLUS -> add(a,b);
            case MINUS -> decrement(a,b);
            case DIV -> division(a,b);
            case MULTI -> multiplication(a,b);
        };
    }

}
