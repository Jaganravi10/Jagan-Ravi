import java.util.Scanner;

public class FindOddOrEvenNumber {

	public static void main(String[] args) {
		
		int givenNumber;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your number");
		givenNumber = input.nextInt();
		
		if (givenNumber %2==0) 
		{
			System.out.println("Given number is even number");
		}
		else 
		{
		System.out.println("Given number is odd number");	
		}
	}

}
