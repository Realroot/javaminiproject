package banking.domain;

import javax.naming.LimitExceededException;

public class CheckingAccount extends Account {
	private double interestRrate;
	private double overdraftAmount;

	public CheckingAccount(double initBalance, double overdraftAmount) {
		super(initBalance);
		this.overdraftAmount = overdraftAmount;
	}

	public void withdraw(double amount) {
		if (balance + overdraftAmount < amount) {
			try {
				throw new LimitExceededException("한도초과");
			} catch (LimitExceededException e) {
				e.printStackTrace();
			}
		} else if (balance < amount) {
			overdraftAmount = overdraftAmount + balance - amount;
			balance = 0;
			System.out.println("잔액: " + balance);
			System.out.println("한도: " + overdraftAmount);
		} else {
			balance = balance - amount;
			System.out.println("잔액: " + balance);
			System.out.println("한도: " + overdraftAmount);
		}
	}
}
