
public class LengthOfLastWord {
	
	public static void lenghtOfLastWord() {
		String givenString = "  Learn Every Day  ";
		String[] stringArr = givenString.trim().split(" ");
		
		int len = stringArr[stringArr.length-1].length();
		
		System.out.println(len);
	}

	public static void lenghtOfLastWordAnotherWay() {
		
		int count = 0;
		String given = "  Everything will be positive  ";
		given = given.trim();
		
		for(int i=given.length()-1;i>=0;i--) {
			
			if(given.charAt(i)== ' ') {
				break;
			}else {
				count++;
		}
	}
		System.out.println(count);
		
}
	public static void main(String[] args) {

		lenghtOfLastWordAnotherWay();

	}

}
