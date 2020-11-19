package InheritanceAndPolymorphism;

public class Student extends Person {
	/* A student has a class status (fresh-man, sophomore, junior, or senior) */
	private String classStatus;
	
	public Student() {
		super();
		classStatus = "";
	}
	public Student(String name, String address, String phoneNumber,String email, String classStatus) {
		super(name,address,phoneNumber,email);
		this.classStatus = classStatus;
	}
	
	public String toString() {
		return(super.toString() + " Class status: " + classStatus);
	}
}
