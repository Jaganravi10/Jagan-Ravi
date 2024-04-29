
public class FirstWordLastWord {

	public static void main(String[] args) {

		String name = "Java Program";
		
		int firstWordPosition = name.indexOf(" ");
		String firstWord = name.substring(0, firstWordPosition);
		
		String lastWord = name.substring(name.lastIndexOf(" ")+1);
		
		System.out.println(firstWord);
		System.out.println(lastWord);

	}

}
