package Loops;

import java.util.Arrays;

public class AnagramOrNot {

	public static void main(String[] args) {
		
		String s1 = "I Am GODD";
		String s2 = "i aM dOGF";
		
		s1 = s1.replace(" ", "");
		s2 = s2.replace(" ", "");
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char[] character1 = s1.toCharArray();
		char[] character2 = s2.toCharArray();
		
		Arrays.sort(character1);
		Arrays.sort(character2);
		
		System.out.println(Arrays.toString(character1));
		System.out.println(Arrays.toString(character2));

		boolean result = Arrays.equals(character1, character2);
		
		if(result == true) 
		{
			System.out.println("Given strings are Anagram");
		}
		else 
		{
			System.out.println("Given strings are not Anagram");
		}

	}

}
