
public class LengthOfAString {

	public static void main(String[] args) {

		String given = "Determination";
		
		System.out.println(given.length());
		
		 char[] charArray=given.toCharArray();
		 
		 int length=0;
		 
		 for (char c : charArray) {
			length++;
			
		}
		 System.out.println(length);
	}

}
