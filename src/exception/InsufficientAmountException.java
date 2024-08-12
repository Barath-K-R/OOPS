package exception;

public class InsufficientAmountException extends Exception{
    double amount;
	public InsufficientAmountException(double d) {
		// TODO Auto-generated constructor stub
		this.amount=d;
	}

}
