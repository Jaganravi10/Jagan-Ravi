
public class MethodOverloading {

	public void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	public void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public void sum(int a, int b, int c, int d) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		mo.sum(10, 20);
		mo.sum(11,12);
		mo.sum(11, 12, 13);
		mo.sum(11, 22, 33, 44);
	}

}
