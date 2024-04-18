
public class LengthOfAStringWithoutLengthMethod {

	public static void main(String[] args) {

		String givenWord = "    Happiness All Around           ";
		
		System.out.println(givenWord.trim());
		
		char[] charArray = givenWord.toCharArray();
		
		int length = 0;
		
		for (char c : charArray) {
			length++;
		}
		System.out.println(length);
	}

}
