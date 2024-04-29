import java.util.Arrays;

public class Interview_Prep {
	
	public static void anagramOrNot() {
		
		String given_1 = "Keep";
		String given_2 = "Peek";
		
		given_1 = given_1.toLowerCase();
		given_2 = given_2.toLowerCase();
		
		char[] arrGiven1 = given_1.toCharArray();
		char[] arrGiven2 = given_2.toCharArray();
		
		Arrays.sort(arrGiven1);
		Arrays.sort(arrGiven2);
		
		boolean result = Arrays.equals(arrGiven1, arrGiven2);
		
		if (result==true) {
			
			System.out.println("Both strings are anagram");
		}else {
			System.out.println("Both strings are not anagram");
		}

	}

	public static void reverseString() {
		
		String myWord = "Hope";
		String result = "";
		
		for(int i = myWord.length()-1; i>=0;i--) {
			result = result+myWord.charAt(i);
		}
		System.out.println(result);

	}

	public static void reverseInteger() {
		
		int myNumber = 223344;
		int temp = 0;
		
		while(myNumber!=0) {
			temp = temp*10+myNumber%10;
			myNumber = myNumber/10;
		}
		System.out.println(temp);
	}

	public static void palindromeString() {
		
		String providedString = "Level";
		providedString = providedString.toLowerCase();
		String tempString = "";
		
		for(int j=providedString.length()-1;j>=0;j--) {
			tempString = tempString+providedString.charAt(j);
		}
		
		if(providedString.equals(tempString)) {
			System.out.println("Given string is palindrome");
		}else {
			System.out.println("Given string is not a palindrome");
		}

	}

	public static void palindromeNumber() {
		
		int provideNum = 16461;
		int resultNum = 0;
		int oriNum = provideNum;
		
		while(provideNum!=0) {
			resultNum = resultNum*10+provideNum%10;
			provideNum = provideNum/10;
		}
		
		if(oriNum==resultNum) 
		{
			System.out.println("Is a palidrome number");
		}
		else
		{
			System.out.println("Is not a palidrome number");
		}

	}
	
	public static void findOddEvenNumber() {
		
		int number = 98;
		
		if(number %2==0) {
			System.out.println("Is a even number");
		}else {
			System.out.println("Is a odd number");
		}

	}

	public static void findLastWordLength() {
		
		int count = 0;
		String myWord = "My time is coming";
		
		for(int h = myWord.length()-1; h>=0; h--) {
			
			if(myWord.charAt(h)== ' ') {
				break;
				
			}else {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void reverseSentence() {
		
		String givenWord = "I will succeed";
		String tempWord = "";
		
		String [] resultWord = givenWord.split(" ");
		
		for(int k = resultWord.length-1; k>=0; k--) {
			tempWord = tempWord+resultWord[k]+" ";
		}
		System.out.println(tempWord);
	}
	
		public static void main(String[] args) {

			findLastWordLength();

		}

}
