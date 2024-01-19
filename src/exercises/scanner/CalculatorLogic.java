package exercises.scanner;

public class CalculatorLogic {
    public String calculate(double a, double b, String sign){
        String result = switch(sign) {
            case "+" -> "Wynik dodawania: "+(a+b);
            case "-"-> "Wynik odejmowania: "+(a-b);
            case "*" -> "Wynik mnożenia: "+(a*b);
            case "/" -> "Wynik dzielenia: "+(a/b);
            default -> "Błędnie wprowadzone dane";
        };
        return result;
    }
}
