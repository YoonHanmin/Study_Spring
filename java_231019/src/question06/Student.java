package question06;

import chapter06.ToStringEx;

public class Student {
	
	public Student(String Name,int Number,String Department) {
		this.Name=Name;
		this.Number= Number;
		this.Department = Department;
	}
	String Name,Department;
	int Number;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getNumber() {
		return Number;
	}
	public void setNumber(int number) {
		Number = number;
	}

	@Override
	public String toString(){
	return "이름 : "+Name+"\n"+"학번 : "+Number+"\n"+"소속학과 : "+Department;
	}
}
