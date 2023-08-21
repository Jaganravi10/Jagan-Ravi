package Loops;

public class StringReverse {

	public static void main(String[] args) {
		
		String given = "All is good and positive";
		String rev = "";
		for(int i = given.length()-1;i>=0;i--) {
			rev = rev+given.charAt(i);
			
		}
		System.out.println(rev);
	}
}
