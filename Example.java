import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		
		String s1 = "cinema";
		String s2 = "iceman";
		
		if (s1.length() != s2.length()) 
		{
			System.out.println("Given strings are not equal, so not anagram");
		}
		else 
		{
			char[] Chararr1 = s1.toCharArray();
			char[] Chararr2 = s2.toCharArray();
			
			Arrays.sort(Chararr1);
			Arrays.sort(Chararr2);
			
			System.out.println(Arrays.toString(Chararr1));
			System.out.println(Arrays.toString(Chararr2));
			
		if (Arrays.equals(Chararr1, Chararr2)==true) 
		{
			System.out.println("Given strings are anagram");
		}	
		else 
		{
		System.out.println("Given strings are not anagram");	
		}
		
		}
		
	}

}
