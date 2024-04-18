
public class ChildClass extends ParentClass{

	public void display() {
		System.out.println("Child Method");
	}
	
	public static void main(String[] args) {
		
		ParentClass pc = new ChildClass ();
		pc.display();

	}

}
