package exercises.errorexcep;

public class AgeViolationException extends RuntimeException{
    public AgeViolationException(String message) {
        super(message);
    }
}
