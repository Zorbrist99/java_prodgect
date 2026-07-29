package HomeWork12.UncheckedExceptions;

public class InvalidBaggageWeightException extends RuntimeException {
    public InvalidBaggageWeightException(String s) {
        super(s);
    }
}
