import java.util.stream.IntStream;

public class ArrayContainsElementOrNot {
	
	int [] given = {1,2,3,4,5,6,6,7,8,9};
	
	int numberToBeFound= 6;
	
	boolean found=false;
	
	public void containsElementOrNot() {
		
		for (int number : given) {
			if(number == numberToBeFound) {
				found=true;
				System.out.println("Number found is "+ numberToBeFound );
				break;
			}
		}
		
		if(found) {
			System.out.println("Number found");
		}else {
			System.out.println("Number not found");
		}
	}

	public void usingIntStream() {
		
		boolean found=IntStream.of(given).anyMatch(element->element==numberToBeFound);
		
		if(found)
			System.out.println("Number found");
		else
			System.out.println("Not found");		
	}
	
	public static void main(String[] args) {

		ArrayContainsElementOrNot arrayContainsElementOrNot = new ArrayContainsElementOrNot();
//		arrayContainsElementOrNot.containsElementOrNot();
		arrayContainsElementOrNot.usingIntStream();

	}

}
