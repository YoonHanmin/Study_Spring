package question06;

public class StudentDriver {
	public static void main(String[] args) {
		Student student1,student2;
		student1 = new Student("갑돌", 100, "컴퓨터공학과");
		System.out.println(student1.toString());
		student2 = new Student("갑순", 200, "건축학과");
		System.out.println(student2.toString());
		student2.Department = "수학과";
		System.out.println(student2.toString());
		
	}
}
