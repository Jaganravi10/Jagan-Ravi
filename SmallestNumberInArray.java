import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestNumberInArray {
	
	int givenArray[]= {41,22,31,11,53};
	
	Integer anotherArray[]= {41,22,31,11,53};

	
	public void usingArrays() {
		
		Arrays.sort(givenArray);
		System.out.println(givenArray[0]);
	}
	
	public void usingCollections() {
		
		List<Integer> list= Arrays.asList(anotherArray);
		Collections.sort(list);
		int smallest = list.get(0);
		System.out.println(smallest);

	}

	public static void main(String[] args) {

		SmallestNumberInArray array= new SmallestNumberInArray();
//		array.usingArrays();
		array.usingCollections();
		

	}

}
