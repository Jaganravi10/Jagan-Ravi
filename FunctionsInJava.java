package Loops;

public class FunctionsInJava {

	public static void main(String[] args) {
		
		FunctionsInJava object = new FunctionsInJava();
		
		 object.test();
		 
		 int d = object.sum();
		 System.out.println(d);
		 
		 String se = object.seleniumMethod();
		 System.out.println(se);
		 
		int f = object.division(30, 10);
		System.out.println(f);
		
		String z = object.send(100, " Keep practising");
		System.out.println(z);

	}

	public void test() {
		System.out.println("No input no out function/method");
	}

	public int sum() {
		System.out.println("Sum Method");
		int a = 20;
		int b = 30; 
		int c = a + b;
		return c;

	}
	
	public String seleniumMethod() {
		System.out.println("This is selenium");
		String s = "Selenium";
		return s;
		
	}
	
	public int division(int a, int b) {
		System.out.println("Division function");
		int c = a/b;
		return c;
	}

	public String send(int Z, String Y) {
		System.out.println("Send function");
		String Q = Z+Y;
		return Q;
	}
}
