import java.util.Arrays;

public class RevAString {

	public static void main(String[] args) {

		String actual = "I have hope";
		String rev = "";
			
		char[] charArr = actual.toCharArray();
		
		System.out.println(Arrays.toString(charArr));
		
		for (int i =charArr.length-1; i>=0; i--) {
			
			rev = rev+charArr[i];
		}
		
		System.out.println(rev.trim());
	}

}
