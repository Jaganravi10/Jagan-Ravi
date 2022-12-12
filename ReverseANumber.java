import java.util.Scanner;

public class ReverseANumber {
	
	public static void main(String[] args) {
		
		int givenNumber=123;
		
		int reversedNumber=0;
		
		/*Using Scanner
		System.out.println("Enter your number: ");
		
		Scanner scanner=new Scanner(System.in);
		givenNumber=scanner.nextInt();*/
		
		while(givenNumber !=0) {
		reversedNumber=reversedNumber*10;
		reversedNumber=reversedNumber+givenNumber%10;
		givenNumber=givenNumber/10;
		
		}
		System.out.println(reversedNumber);
	}
	
}
