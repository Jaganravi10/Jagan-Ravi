
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Interview_Prep {
	
	public static void anagramOrNot() {
		
		String given1 = " Keep ";
		String given2 = " Peek ";
		
		given1 = given1.toLowerCase().trim();
		given2 = given2.toLowerCase().trim();
		
		char[] charArray1 = given1.toCharArray();
		char[] charArray2 = given2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		boolean result = Arrays.equals(charArray1, charArray2);
		
		if(result == true) {
			System.out.println("Given strings are anagram");
			
		}else{
			System.out.println("Given strings are not anagram");
		}

	}

	public static void reverseString() {
		
		String actualWord = "Suprise";
		String reverseWord = "";
		
		for(int i = actualWord.length()-1;i>=0;i--) {
			
			reverseWord = reverseWord+actualWord.charAt(i);
		}
		
		System.out.println(reverseWord);

	}

	public static void reverseInteger() {
		
		long givenNumber = 23234455;
		long temp = 0;
		
		while(givenNumber!=0) {
			temp = temp*10+givenNumber%10;
			givenNumber = givenNumber/10;
			
		}
		
		System.out.println(temp);
		
	}

	public static void palindromeString() {
		
		String given = "Madam";
		String expected = "";
		
		for(int i=given.length()-1;i>=0;i--) {
			expected = expected+given.charAt(i);
			
			}
			if(given.equalsIgnoreCase(expected)) {
			System.out.println("Is a palindrom string");
			}
			else {
				System.out.println("Not a palidrome");
			}
			
		}
		

	public static void palindromeNumber() {
		
		int given = 2332;
		int temp = 0;
		
		while(given!=0) {
			temp = temp*10+given%10;
			given = given/10;
		}	
		
		System.out.println(temp);
	
	}
	
	public static void findOddEvenNumber() {
		
		int givenNumber = 7;
		
		if(givenNumber%2==0) {
			System.out.println("Is even number");
		}else {
			System.out.println("Is odd number");
		}

	}

	public static void findLastWordLength() {
		
		String mySentence = "Positive days are coming";
		int count = 0;
				
		for(int i=mySentence.length()-1;i>=0;i-- ) {
			if(mySentence.charAt(i)==' ') {
				break;
			}else {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void reverseSentence() {
		
		String givenSentence = "Yes positive days are coming";
		String temp = "";
		String [] charSentence = givenSentence.split(" ");
		
		for(int i=charSentence.length-1;i>=0;i--) {
			temp = temp+charSentence[i]+" ";
		}
		System.out.println(temp);
	} 
	
	public static void usingStringBuffer() {
		
		String given = "Angel";
		
		StringBuffer buffer = new StringBuffer();
		buffer.append(given);
		
		System.out.println(buffer.reverse());
		
	}
	
	public static void findCharacterOccurance() {
		
		String word = "Impossible is nothing";
		word = word.toLowerCase();
		char toFind = 'i';
		int occurance = 0;
		
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)==toFind) {
				occurance = occurance+1;
			}
		}
		System.out.println(occurance);
	}
			
	public static void findLastWord() {
		
		String givenSentence = "Your time is coming";
		String[] charTemp = givenSentence.split(" ");
		int i;
		
		for(i=0; i<charTemp.length-1;i++) {
			
		}
		
		System.out.println(charTemp[i]);
	}
	
	public static void findSmallestNumberUsingArrays() {
		
		int [] numbers = new int[] {5,4,3,6,7,10,11,15,0};
		
		Arrays.sort(numbers);
		
		System.out.println(numbers[0]);
		
	}
	
	public static void findSmallestNumberUsingCollections() {
		
		Integer numbers[] = {12,13,14,5,3,6,2};
		
		List<Integer> numbersList = Arrays.asList(numbers);
		Collections.sort(numbersList);
		Integer smallest = numbersList.get(0);
		System.out.println(smallest);
		
	}
	
	public static void findSmallestNumber() {
		
		Integer given[] = {12,13,14,5,3,6,2};
		
		int smallest = Integer.MAX_VALUE;
		
		for(int i = 0; i<given.length;i++) {
			
			if(given[i]<smallest) {
				smallest=given[i];
			}
		}
		
		 System.out.println(smallest);
		
	}
	
	public static void findDuplicateValue() {
		
		int[] numbers = {22,33,22,14,15,16,17,18,14};
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]==numbers[j]) {
					System.out.println("Duplicate value is "+ numbers[i]);
				}
			}
		}
		
	}
		public static void main(String[] args) {

			findSmallestNumberUsingCollections();
			
		}

}
