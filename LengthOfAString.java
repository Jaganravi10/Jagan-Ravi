
public class LengthOfAString {
	
	public void lengthOfString() {
		
		String len = "Number of letters";
		
		char[] charArr = len.toCharArray();
		
		int length = 0;
		
		for (char c : charArr) {
			length++;
		}
		System.out.println("Number of letters are "+length);
	}

	public static void main(String[] args) {
		
		LengthOfAString stringLength = new LengthOfAString();
		stringLength.lengthOfString();

		/*
		 * String given = "All is good";
		 * 
		 * char [] charArray=given.toCharArray();
		 * 
		 * int length = 0;
		 * 
		 * for (char c : charArray) { length++; } System.out.println(length);
		 */
	}

}
