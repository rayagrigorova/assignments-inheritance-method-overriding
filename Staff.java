package InheritanceAndPolymorphism;

import java.util.Date;

public class Staff extends Employee {
	/* A staff member has a title. */
	private String title;
	
	public Staff() {
		super();
		title = "";
	}
	
	public Staff(String name, String address, String phoneNumber,String email,
			String office, double salary, Date dateHired, String title ) {
		super(name, address, phoneNumber, email, office, salary, dateHired);
		this.title = title;
	}
	
	public String toString() {
		return (super.toString() + " Title: " + title);
	}
}
