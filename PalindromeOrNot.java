
public class PalindromeOrNot {
	
	public static void palindromeString() {
		
		String palindromeWord = "Radar ";
		palindromeWord=palindromeWord.toLowerCase().trim();
		String revString = "";
		
		for(int i=palindromeWord.length()-1;i>=0;i--) {
			
			revString=revString+palindromeWord.charAt(i);
			
		}
		if (palindromeWord.equals(revString)) {
			System.out.println("Is Palindrome");
			
		}else {
			System.out.println("Not a palindrome");
		}

	}
	
	public static void palidromeNumber() {
		
		int givenNumber = 345678;
		int revNumber = 0;
		
		while(givenNumber!=0) {
			revNumber = revNumber*10+givenNumber%10;
			givenNumber = givenNumber/10;
		}
		System.out.println(revNumber);
	}
	
	public static void main(String[] args) {
	
		palidromeNumber();
	}
}
