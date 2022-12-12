
public class PrintTriangle {
	
	public static void main(String[] args) {
		
		int startingNumber=1;
		
		int row, column;
		
		int limit=5;
		
		for(row=0; row<limit; row++) {
			
			for(column=0; column<=row; column++) {
				
				System.out.print(startingNumber+" ");
				startingNumber=startingNumber+1;
			}
			
			System.out.println();
		}
		
	}

}
