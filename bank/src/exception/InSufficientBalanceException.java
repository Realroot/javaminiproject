package exception;

public class InSufficientBalanceException extends Exception{

	public InSufficientBalanceException() {
		super();
	}
	
	public InSufficientBalanceException(String message) {
		super(message);
	}
}
