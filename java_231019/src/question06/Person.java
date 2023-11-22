package question06;

public class Person {
	String lastName;
	String firstName;
	
	public Person(String lastName,String firstName) {
		this.lastName= lastName;
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
		
	}
	public String getFirstName() {
		return firstName;
		
	}
	public int getLength() {
		String str = lastName+firstName;
		return str.length();
	}
}
