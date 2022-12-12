
public class FindMaxNumberInSingleIteration {

	public static void main(String[] args) {

		int [] arr = {48,51,25,36,43};

		int assumeMax = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > assumeMax) {

				assumeMax = arr[i];
			}
			
		}
		
		System.out.println("Max value in given array is " + assumeMax);
	}

}
