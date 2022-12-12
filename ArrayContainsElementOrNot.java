import java.util.stream.IntStream;

public class ArrayContainsElementOrNot {
	
	int[] array = {1,2,4,5,6,7};
	
	int numberToFind=13;
	
	public void usingIntStream() {
		
	boolean found=IntStream.of(array).anyMatch(element->element==numberToFind);
		
	if(found) {
		System.out.println("Element present");
		
	}else
		System.out.println("Element not present");
	
	}

	public static void main(String[] args) {

		ArrayContainsElementOrNot arrayContainsElementOrNot = new ArrayContainsElementOrNot();
		arrayContainsElementOrNot.usingIntStream();
	}

}
