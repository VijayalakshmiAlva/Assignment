package assignment;

import java.util.Date;

class Account1 {
	private int id = 0;
	private double balance = 0.0;
	private double annualInterestRate = 0.0;
	private Date dateCreated;

	public Account1(int i, double b) {
		this.id = i;
		this.balance = b;
		dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setDetails(int i, double b, double s) {
		this.id = i;
		this.balance = b;
		this.annualInterestRate = s;
	}

	public double getMonthlyInterestRate() {
		return (annualInterestRate / 100) / 12;

	}

	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}

	public void withdraw(double amount) {
		this.balance -= amount;

	}

	public void deposit(double amount) {
		this.balance += amount;

	}

}

public class Account {
	public static void main(String args[]) {
		Account1 a1 = new Account1(4584, 58967);
		a1.setDetails(1, 56666, 3);
		a1.withdraw(2000);
		a1.deposit(4000);
		System.out.println("balance  " + a1.getBalance());
		System.out.println("id  " + a1.getId());
		System.out.println("monthly interest rate  " + a1.getMonthlyInterestRate());
		System.out.println("monthly interest  " + a1.getMonthlyInterest());
		System.out.println("date  " + a1.getDateCreated());

	}

}
