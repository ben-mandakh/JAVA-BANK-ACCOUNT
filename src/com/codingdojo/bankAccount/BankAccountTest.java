package com.codingdojo.bankAccount;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount();
		
		System.out.println("**********************************");
		System.out.println("All users' account numbers: ");
		System.out.println(b2.getAccountNumber());
		System.out.println(b1.getAccountNumber());
		
		//////////// DEPOSIT TEST ////////////////
		
		b1.deposit("checking", 35000.0);
		b1.deposit("savings", 8000.0);
		
		System.out.println("**********************************");
		System.out.println("User: " + b1.getAccountNumber() + " "  + "deposited: ");
		System.out.println("Checking: " + b1.getChecking());
		System.out.println("Savings: " + b1.getSavings());
		
		////////////WITHDRAW TEST ////////////////
		
		System.out.println("**********************************");
		System.out.println("User: " + b1.getAccountNumber() + " "  + "withdrew: ");
		b1.withdraw("checking", 3500.0);
		b1.withdraw("savings", 800.0);
		
		System.out.println("Checking: " + b1.getChecking());
		System.out.println("Savings: " + b1.getSavings());
		
		////////////TOTAL BALANCE ////////////////
		
		System.out.println("**********************************");
		System.out.println("Total amount in all accounts: " + BankAccount.getTotal());
		System.out.println("Total number of all accounts: " + BankAccount.getNumberOfAccounts());
		
	}
}

