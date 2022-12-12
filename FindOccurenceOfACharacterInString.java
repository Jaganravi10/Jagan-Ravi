
public class FindOccurenceOfACharacterInString {

	public static void main(String[] args) {

		String input = "Perseverance";
		
		char toFind='e';
		
		int occurence=0;
		
		input=input.toLowerCase();
		
		for(int i=0; i<input.length();i++) {
			
			if(input.charAt(i)==toFind) {
				occurence=occurence+1;
			}
		}
		
		System.out.println(toFind+ " is present "+ occurence + " number of times");
	}

}
