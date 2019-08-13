package com.codingdojo.bankAccount;

import java.util.Random;

public class BankAccount {
	private String accountNumber;   /// attributes of this class section 
	private double checking;
	private double savings;
	private static int numberOfAccounts = 0; /// class member section
	private static double total = 0.0;
	
	
	
	private String generateAccountNumber() {
		String acc = "";
		Random r = new Random();
		
		for (int i=0; i<10; i++) {
			acc += String.valueOf(r.nextInt(9));
		}
		return acc;
	}
	public BankAccount() {        /// Constructor section
		this.accountNumber = this.generateAccountNumber();
		numberOfAccounts++;      /// Incrementing account count
	}
	////////////////////////////////////////////////////////
	
	public double deposit(String accountType, double amount) {   /// Deposit method, return the balance of both account types
		
		if(accountType.equals("checking")) {
			this.checking += amount;
			total += amount;
			return this.checking;
		}else {
			this.savings += amount;
			total += amount;
			return this.savings;
		}
	}
	
	////////////////////////////////////////////////////////
	
	public double withdraw(String accountType, double amount) {   /// Withdraw method, return the balance of both account types
		
		if(accountType.equals("checking")) {
			if(amount <= this.checking) {    /// checking here if the account has sufficient balance
				this.checking -= amount;
				total -= amount;
				return this.checking;
			} else {
				return this.checking;
			}
		}else {
			if(amount <= this.savings) {    /// checking here if the account has sufficient balance
				this.savings -= amount;
				total -= amount;
				return this.savings;
			}
			else {
				return this.savings;
			}
		}
	}

////////////////////////GETTER, SETTER, CLASS MEMBER///////////////////////////////////
	
	
	public String getAccountNumber() {
		return this.accountNumber;
	}
	public static int getNumberOfAccounts() {   /// class member
		return numberOfAccounts;
	}
	
	public void setAccountNumber( String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getSavings() {                 /// getter for Savings
		return savings;
	}
	public void setSavings(double savings) {    /// setter for Savings
		this.savings = savings;
	}
	public double getChecking() {               /// getter for Checking 
		return checking;
	}
	public void setChecking(double checking) { /// setter for Checking
		this.checking = checking;
	}
	public static double getTotal() {         /// class member
		return total;
	}
}
