package pl.waw.sgh.bank.exceptions;

public class InvalidAmountException extends BankException {
    public InvalidAmountException(String s) {
        super(s);
    }

    public InvalidAmountException() {
        super("System cannot operate on negative amounts.");
    }

}