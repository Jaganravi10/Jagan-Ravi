package Loops;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String a1 = "Bad";
		String a2 = "Dad";
		
		a1 = a1.toLowerCase();
		a2 = a2.toLowerCase();
		
		char charac1 [] = a1.toCharArray();
		char charac2 [] = a2.toCharArray();
		
		Arrays.sort(charac1);
		Arrays.sort(charac2);

		boolean resul = Arrays.equals(charac1, charac2);
		
		if(resul == true)
		{
			System.out.println("Given string is a anagram");
		}
		else
		{
			System.out.println("Given string is not a anagram");
		}

	}

}
