package InheritanceAndPolymorphism;

import java.util.Date;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		
		Person p = new Person("Karl", "Some Str. 737","477474479","karl@gmail.com");
		
		Employee e = new Employee("Klara", "Street Street 4646", "04848444", "klara@gmail.com",
			"Some Office", 2043, d);
		
		Faculty f = new Faculty("Gergana","Some Str. 44", "00012991","gergana@gmail.com",
			"Office Office", 6646, d, 40 , "Chef") ;
		
		Staff s = new Staff("Ivan", "Street 232", "344343","ivan@gmail.com",
			"Ivan office", 2774, d, "Staff member" );
		
		Student st = new Student("Kiril", "Street 644", "994773289976","kiko@gmail.com", "freshman");
		
		System.out.println(p.toString());
		System.out.println(e.toString());
		System.out.println(f.toString());
		System.out.println(s.toString());
		System.out.println(st.toString());
	}

}
