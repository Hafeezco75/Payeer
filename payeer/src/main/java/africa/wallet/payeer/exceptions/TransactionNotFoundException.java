package africa.wallet.payeer.exceptions;

public class TransactionNotFoundException extends Exception {

    public TransactionNotFoundException(String message) {
        super(message);
    }
}