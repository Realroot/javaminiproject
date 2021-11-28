package banking.domain;

import java.util.*;

public class Customer {
	private String name;
	private String ssn;
	private ArrayList<Account> accounts;
	private int numberOfAccounts;

	public Customer(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		this.accounts = new ArrayList<>();
		this.numberOfAccounts = 0;
	}

	public void addAccount(Account acct) {
		accounts.add(acct);
		numberOfAccounts++;
	}

	public Account getAccount(int accountIndex) {
		return accounts.get(accountIndex);
	}

	public int getNumOfAccount() {
		return numberOfAccounts;
	}

	public String getName() {
		return name;
	}

	public String getSSn() {
		return ssn;
	}
}
