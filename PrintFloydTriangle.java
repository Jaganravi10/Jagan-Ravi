import java.util.Scanner;

public class PrintFloydTriangle {

	public static void main(String[] args) {

		
		//Getting input from user
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the number of lines");
//		
//		int numberOfLines=scanner.nextInt();
//		
////		int numberOfLines = 8;
//		
//		int row,column = 0;
//		
//		for (row = 0; row<numberOfLines; row++) {
//			for (column = 0; column<=row; column++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

		int startingLine= 1;
		int limitNumber=10;
		int row, column;
		
		for(row=0; row<limitNumber; row++) {
			for (column=0; column<=row; column++) {
				System.out.print(startingLine+ " ");
				startingLine=startingLine+1;
			}
			System.out.println();
		}
	}

}
