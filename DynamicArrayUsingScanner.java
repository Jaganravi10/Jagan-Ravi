import java.util.Scanner;

public class DynamicArrayUsingScanner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		
		int size = scanner.nextInt();
		
		int[] arrary = new int [size];
		
		System.out.println("Enter the " + size + " elements");
		
		for(int i=0; i<arrary.length; i++) {
			arrary[i] = scanner.nextInt();
		}
		
		System.out.println("Entered values are below");
		
		for(int i=0; i<arrary.length; i++) {
			System.out.println(arrary[i]);
			
		}
	}

}
