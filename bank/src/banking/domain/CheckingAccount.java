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
				throw new LimitExceededException("�ѵ��ʰ�");
			} catch (LimitExceededException e) {
				e.printStackTrace();
			}
		} else if (balance < amount) {
			overdraftAmount = overdraftAmount + balance - amount;
			balance = 0;
			System.out.println("�ܾ�: " + balance);
			System.out.println("�ѵ�: " + overdraftAmount);
		} else {
			balance = balance - amount;
			System.out.println("�ܾ�: " + balance);
			System.out.println("�ѵ�: " + overdraftAmount);
		}
	}
}
