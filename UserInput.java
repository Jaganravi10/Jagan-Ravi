import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String yourname = scan.nextLine();
		
		System.out.println("Enter your name:");
		String hisname = scan.nextLine();
		 
		System.out.println("Enter your name:");
		String hername = scan.nextLine();
		
		System.out.println("Here are your names");
		System.out.println(yourname);
		System.out.println(hisname);
		System.out.println(hername);

	}

}
