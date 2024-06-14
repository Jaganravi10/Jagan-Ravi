
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

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
		System.out.println("Last word lenght is "+count);
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
		
		String givenWord = new String("Eveything will be alright soon don't worry");
		givenWord=givenWord.toLowerCase();
		char letterToFind = 'e';
		int occurance = 0;
		
		for(int i=0;i<givenWord.length();i++) {
			if(givenWord.charAt(i)==letterToFind) {
				occurance=occurance+1;
			}
		}
		System.out.println(letterToFind+" appears "+occurance+" times in the given string");
	}
			
	public static void findLastWord() {
		
		String givenSentence = "Your time is coming now";
		String[] charTemp = givenSentence.split(" ");
		System.out.println(Arrays.toString(charTemp));
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
		
		int[] numbers = {22,33,22,14,15,16,17,18};
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]==numbers[j]) {
					System.out.println("Duplicate value is "+ numbers[i]);
				}
			}
		}
		
	}
	
	public static void printNumbersWithOutEnteringNumbers() {
		
		int one = 'A'/'A';
		System.out.println();
		String dots = "..........";
		
		for(int i=one;i<=dots.length()*dots.length();i++) {
			System.out.println(i);
		}
		
		for(int i=one;i<='d';i+=one) {
			System.out.println(i);
		}
	
	}
	
	public static void findSecondSmallestNumber() {
		
		int[] givenArray = {4,10,3,5,6,7,8,1,99,11,2,0};
		
		int smallestNumber=Integer.MAX_VALUE;
		int secondSmallestNumber=Integer.MAX_VALUE;
		
		for(int i=0;i<givenArray.length;i++) {
			if(smallestNumber>givenArray[i]) {
				secondSmallestNumber=smallestNumber;
				smallestNumber=givenArray[i];
			}
			if(smallestNumber<givenArray[i]&&secondSmallestNumber>givenArray[i]) {
				secondSmallestNumber=givenArray[i];
			}
		}
		System.out.println(secondSmallestNumber);
	}
	
	public static void findLargestNumber() {
		
		Integer given[] = {12,13,14,5,3,6,2,99,101,1000};
		
		int largest = Integer.MIN_VALUE;
		
		for(int i = 0; i<given.length;i++) {
			
			if(given[i]>largest) {
				largest=given[i];
			}
		}
		
		 System.out.println(largest);
		
	}
	
	public static void checkArrayContainsGivenValue() {
		
		int[] numbers = {12,3,4,5,6,1,7,8,9};
		int numberToFind = 55;
		
		boolean found = Arrays.stream(numbers).anyMatch(element -> element == numberToFind);
		if(found) {
			System.out.println(numberToFind+" is found");
		}else {
			System.out.println(numberToFind+" is not found");
		}
		
//		boolean result = false;
//		
//		for (int values : numbers) {
//			if(values==numberToFind) {
//				result=true;
//				break;
//			}
//		}
//		if(result) {
//			System.out.println(numberToFind+" is found");
//		}else {
//			System.out.println(numberToFind+" is not found");
//		}
	}
	
		public static void main(String[] args) {

			checkArrayContainsGivenValue();
			
		}

}
