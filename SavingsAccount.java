package InheritanceAndPolymorphism;

public class SavingsAccount extends Account {
	SavingsAccount(){
		super();
	}
	
	SavingsAccount(int id, double balance, double yearInterestRate){
		super(id, balance, yearInterestRate);
	}
	
	public String toString() {
		return(super.toString() + " Account type: Savings account");
	}
}
