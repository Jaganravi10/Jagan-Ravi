
public class FindAscii {
	
	public static void findAscciValue() {
		
		char f = 'f';
		int value = (int)f;
		System.out.println("Ascii value of " + f + " is " + value );
	}
	
	public static void findAscciValueOfString() {
		
		String givenValue = "God";
		
		for(int i=0; i<givenValue.length(); i++) {
			int asciiValue = givenValue.charAt(i);
			System.out.println(asciiValue);
		}
	}

	public static void main(String[] args) {
		
		findAscciValueOfString();

	}
}
