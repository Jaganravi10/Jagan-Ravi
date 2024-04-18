
public class AnotherStaticBlock extends StaticBlock{

	
	public static void staticMethod() {
		System.out.println("This is another static method");
	}
	
	@Override
	public void nonStaticBlock() {
		 System.out.println("This is another non static block");
	 }
	
	public static void main(String[] args) {
		
		StaticBlock staticBlock = new AnotherStaticBlock();
		staticBlock.nonStaticBlock();
		staticMethod();
	}

}
