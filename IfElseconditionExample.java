import java.util.Scanner;

public class IfElseconditionExample {
	
	public static void main(String[] args) {
		
		// If Else example
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("User please enter your age");
//		int age = scanner.nextInt();
//		System.out.println("Your age is " +age);
//		
//		if(age < 18) { //only when true this if block is executed
//			System.out.println("You are a child");
//		}else {
//			System.out.println("You are an adult");
//		}
//		System.out.println("Outside of if block");
		
		// If Else ladder example
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("User please enter your number");
//		int inputNumber = scanner.nextInt();
//		System.out.println("Entered number is " +inputNumber);
//		
//		if(inputNumber > 0) {
//			System.out.println("This is positive");
//		} else if (inputNumber < 0) {
//			System.out.println("This is negative");
//		} else {
//			System.out.println("Neither positive or negative");
//		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("User please enter your number");
		int inputNumber = scanner.nextInt();
		System.out.println("Entered number is " +inputNumber);
		
		if(inputNumber > 100) {
			
			if(inputNumber < 200) {
				System.out.println("Number is between 100 to 200");
			}else
				System.out.println("Number is above 200");
			}
		}
		
	}

