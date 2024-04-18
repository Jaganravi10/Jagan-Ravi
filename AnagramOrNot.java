import java.util.Arrays;

public class AnagramOrNot {

	public static void main(String[] args) {

		String myString1 = "Heart";
		String myString2 = "Earth";
		
		myString1 = myString1.toLowerCase();
		myString2 = myString2.toLowerCase();
		
		char[] char1 = myString1.toCharArray();
		char[] char2 = myString2.toCharArray();
				
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		boolean result = Arrays.equals(char1, char2);
		
		if (result == true) {
			System.out.println("Given strings are Anagram");
		}
		else {
			System.out.println("Given strings are not Anagram");
		}
	}

}
