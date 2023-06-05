
public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("My school name is "+Student.schoolName);
		
		Student student = new Student();
		student.studentName = "Java";
		student.rollNumber = 22;
		System.out.println("Student name is "+student.studentName);
		System.out.println("Student roll number is "+student.rollNumber);
		Student.exam();
		student.result(student.studentName);
		
		Student student1 = new Student();
		student1.studentName = "JavaScript";
		student1.rollNumber = 33;
		System.out.println("Student 1 name is "+student1.studentName);
		System.out.println("Student 1 roll number is "+student1.rollNumber);
		Student.exam();
		student1.result(student1.studentName);
	}

}
