
public class StaticBlock {
	
	 static {
		System.out.println("This is static block");
	}
	 
	 public static void staticMethod() {
		 System.out.println("This is static method");
	 }
	 
	 public void nonStaticBlock() {
		 staticMethod();
		 System.out.println("This is non static block");
	 }

	public static void main(String[] args) {
		
		StaticBlock.staticMethod();
		staticMethod();
		System.out.println("This is main method block");
		StaticBlock block=new StaticBlock();
		block.nonStaticBlock();
	}

}
