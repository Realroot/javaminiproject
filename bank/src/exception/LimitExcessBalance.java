package exception;

public class LimitExcessBalance extends Exception {
	public LimitExcessBalance() {
		super();
	}
	
	public LimitExcessBalance(String message) {
		super(message);
	}
}
