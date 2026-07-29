package HomeWork12.UncheckedExceptions;

public class InvalidPassengerNameException extends RuntimeException {

    public InvalidPassengerNameException(String s) {
        super(s);
    }
}
