import java.util.Scanner;

public class Example_2 {
	
	public void stringRev() {
		
		String str = "Manual is tricky";
		String gvn = "";
		String [] strings = str.split(" ");
		
		for(int i = strings.length-1; i>=0; i--) {
			gvn=gvn+strings[i]+" ";
		}
		System.out.println(gvn);
	}
	
public static void main(String[] args) {
	
	Example_2 example_2 = new Example_2();
	example_2.stringRev();
	
	Scanner scanner = new Scanner (System.in);
	
	System.out.println("Please enter the number");
	
	int enteredNumber = scanner.nextInt();
	
	if(enteredNumber >0) {
		System.out.println("Positive number");
	}else
		System.out.println("Negative number");
	}

}
