package InheritanceAndPolymorphism;

import java.util.Date;

public class Faculty extends Employee {
	/* A faculty member has office hours and a rank. */
	private double officeHours;
	private String rank;
	
	public Faculty() {
		super();
		officeHours = 0;
		rank = "";
	}
	public Faculty(String name, String address, String phoneNumber,String email,
			String office, double salary, Date dateHired,double officeHours,String rank  ) {
		super(name, address, phoneNumber, email, office, salary, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public double getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(double officeHours) {
		this.officeHours = officeHours;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public String toString() {
		return(super.toString() + " Office hours: " + officeHours + " Rank:" + rank);
	}
}
