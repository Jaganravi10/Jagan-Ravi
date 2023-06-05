
public class MainClassConstructor {

	public static void main(String[] args) {
		
//		StudentConstructor constructor = new StudentConstructor();
//		System.out.println("Student name is "+constructor.name);
//		System.out.println("Roll number is "+constructor.rollNumber);
		
		StudentConstructor studentConstructor = new StudentConstructor("Java", 123);
		System.out.println(studentConstructor.name);
		System.out.println(studentConstructor.rollNumber);
		
		StudentConstructor studentConstructor2 = new StudentConstructor("JavaScript", 456);
		System.out.println(studentConstructor2.name);
		System.out.println(studentConstructor2.rollNumber);
		
	}

}
