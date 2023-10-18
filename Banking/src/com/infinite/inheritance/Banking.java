package com.infinite.inheritance;

import java.util.Scanner;

class Account { // creating a public Class
	protected String accountId; //
	protected String accountName;
	protected String address;
	protected double depositAmount;

	public Account(String accountId, String accountName, String address) {
		this.accountId = accountId;
		this.accountName = accountName;
		this.address = address;
		this.depositAmount = 0.0;
	}

	public void getDetails() {
		System.out.println("Account Id:" + accountId);
		System.out.println("account Name:" + accountName);
		System.out.println("address:" + address);
		System.out.println("depositAmount:" + depositAmount);

	}

	public void showDetails() {
		System.out.println("Account Details:");
		getDetails();
	}

	public void depositAmount(double amount) {
		depositAmount += amount;
	}

}

class Loan extends Account {
	private String loanId;
	private String loanType;
	private double loanAmount;
	


	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Loan(String accountId, String accountName, String address, String loanId, String loanType) {
		super(accountId, accountName, address);
		this.loanId = loanId;
		this.loanType = loanType;
		}

	public void getLoan() {
		System.out.println("loan Id:" + loanId);
		System.out.println("loan Type:" + loanType);
		System.out.println("loan Amount" + loanAmount);
	}

	public void showLoanDetails() {
		System.out.println("Loan Details");
		getLoan();
	}
}

class Transaction extends Loan {
	private double Amount;

	public void payLoan(double amount) {
		setLoanAmount(amount);
	}

	public Transaction(String accountId, String accountName, String address, String loanId, String loanType,
			double Amount) {
		super(accountId, accountName, address, loanId, loanType);
	}

	public void showLoanDetails() {
		System.out.println("Account and Loan Details");
		super.showDetails();
		super.showLoanDetails();
	}
}

public class Banking {
	public static void main(String args[]) {
		Transaction[] accounts = new Transaction[10];
		Scanner scanner = new Scanner(System.in);
		System.out.println("perform deposit amount:");
		double depositAmount = scanner.nextDouble();
		accounts[0] = new Transaction("23444-REKJ", "pradeep", "5-120 kallur", "L878", "Education",depositAmount);
	accounts[0].getDetails();
	accounts[0].getLoan();
		
		
		
	}
}