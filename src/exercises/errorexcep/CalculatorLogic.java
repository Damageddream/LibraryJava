package exercises.errorexcep;

import java.util.Scanner;

public class CalculatorLogic {
    public double calculate(double a, double b, String operator) throws UnknownOperatorException {
        double result = 0;

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if(a == 0 || b == 0)
                    throw new ArithmeticException();
                result = a / b;
                break;
            default:
                throw new UnknownOperatorException();

        }

        return result;
    }
}
