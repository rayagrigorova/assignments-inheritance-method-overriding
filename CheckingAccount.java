package InheritanceAndPolymorphism;

import java.util.Date;

public class CheckingAccount extends Account {
	private double overdraftLimit;
	
	CheckingAccount(){
		super();
		overdraftLimit = 0;
	}
	CheckingAccount(int id, double balance,double yearInterestRate, double overdraftLimit){
		super(id, balance, yearInterestRate);
		this.overdraftLimit = overdraftLimit;
	}
	

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	public void withdraw(double s){
		if(s > 0 && this.getBalance() >= s && s <= this.getOverdraftLimit()) {
			this.setBalance(this.getBalance() - s);
		}
		else {
			System.out.println("The sum you tried to withdraw is too high or invalid");
		}
		return;
	}
	
	public String toString() {
		return (super.toString() + " Account type: Checking account" + " Overdraft Limit: " + overdraftLimit);
	}
}
