
public class ReverseInteger {

	public static void main(String[] args) {
		
		long num = 123456;
		
		long reverse = 0;
		
		while(num !=0) {
			reverse = reverse * 10 + num % 10;
			num = num/10;
		}
		
		System.out.println("Reverse number = " +reverse);
		
		long num1 = 987654;
		
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}
	
		

}
