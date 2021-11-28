package banking.domain;

import exception.InSufficientBalanceException;

public class Account {
  protected double balance;
  
  public Account(double initBalance){
	  this.balance = initBalance;
  }
  
  public double getBalance() {
	  return this.balance;
  }
  
  public void deposite(double amount) {
	  balance = balance + amount;
  }
  
  public void withdraw(double amount) {
	  if(amount >balance) {
		try {
			throw new InSufficientBalanceException("InSufficent Balance");
		}catch(InSufficientBalanceException e){
			e.printStackTrace();
		}
	  }else {
	  balance = balance - amount;
	  System.out.println("ภÜพื : "+balance);
	  }
  }
}