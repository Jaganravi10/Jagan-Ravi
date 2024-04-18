import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSmallestNumber {

	Integer givenArray[] = { 22, 3, 5, 6, 7, 33, 54 };

	public void findSmallestNumber() {

		int smallest = Integer.MAX_VALUE;

		for (int i = 0; i < givenArray.length; i++) {
			if (givenArray[i] < smallest) {
				smallest = givenArray[i];
			}
		}
		System.out.println(smallest);
	}

	public void usingArrays() {

		Arrays.sort(givenArray);
		System.out.println(givenArray[0]);
	}

	// When generics is mentioned as Integer wrapper class we need to change the
	// datatype to same wrapper class
	public void usingCollections() {

		List<Integer> list = Arrays.asList(givenArray); 
		
		Collections.sort(list);
		
		int smallestNum = list.get(0);
		
		System.out.println(smallestNum);
	}

	public static void main(String[] args) {

		FindSmallestNumber smallestNumber = new FindSmallestNumber();
		// smallestNumber.findSmallestNumber();
		// smallestNumber.usingArrays();
		smallestNumber.usingCollections();

	}

}
