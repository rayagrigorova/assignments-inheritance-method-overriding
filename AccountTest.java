package InheritanceAndPolymorphism;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account(477757, 130.5, 2.3);
		SavingsAccount b = new SavingsAccount(376466, 474.43, 1.5);
		CheckingAccount c = new CheckingAccount(32323, 143.56, 1.9, 50);
		
		System.out.println(a.toString() + "\n" + b.toString() + "\n" + c.toString());
	}

}
