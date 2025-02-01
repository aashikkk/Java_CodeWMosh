package exceptions;

// Checked -> Exception
// Unchecked (runtime) -> RuntimeException

public class InsufficientFundException extends Exception{

    public InsufficientFundException() {
        super("Insufficient funds in your account");
    }

    public InsufficientFundException(String message){
        super(message);
    }
}
