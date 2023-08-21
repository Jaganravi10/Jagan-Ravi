package Loops;


public class StringReverseAndPalindrome {

	public static void main(String[] args) {
		
		String S = "madam";
		String rev= "";
		for (int i=S.length()-1; i>=0; i--) 
		{
		rev=rev+S.charAt(i);
		}
		
		System.out.println(rev);
		
	if (S.equals(rev))
		
		System.out.println("Is Palindrome");
		else System.out.println("Is not a palindrome");
		
	}
		
	}

