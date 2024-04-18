import java.util.Arrays;

public class StringReverse {

	public static void main(String[] args) {

		String given = "Madam";
		String reverse = "";
		
		for(int i = given.length()-1; i>=0; i--) 
		{
			reverse = reverse+given.charAt(i);
		}
		System.out.println(reverse);
		if(given.equalsIgnoreCase(reverse)) {
			System.out.println("Given strings are palindrome");
		}else {
			System.out.println("Given strings are not palindrome");
		}
	}

}
