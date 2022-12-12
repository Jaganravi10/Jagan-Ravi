
public class FindDuplicateValue {

	public static void main(String[] args) {

		int [] arr = {48,51,25,36,43,25};
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				
				if(arr[i] == arr[j])
					
					System.out.println("Duplicate value is " + arr[i]);
					
				}
			}
			
		}

	}

