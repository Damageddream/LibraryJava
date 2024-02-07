package exercises.repetition.exceptions;

public enum Signs {
    PLUS("+"),
    MINUS("-"),
    DIV("/"),
    MULTI("*");

    private String sign;

    public String getSign() {
        return sign;
    }

    Signs(String sign) {
        this.sign = sign;
    }
    public static Signs getByDescribtion(String sign) throws UnknownOperatorException{
        for (Signs value : Signs.values()) {
            if(value.getSign().equals(sign)) {
                return value;
            }
        }
        throw new UnknownOperatorException("Nie ma takiego działania");
    }

}
