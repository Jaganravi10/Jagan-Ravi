
public class UnsupportedCharacters {

	public static void main(String[] args) {
		
		// Remove unsupported characters using Regular Expressions
		
		String unsupported = "!@#$%& Java Selenium 🤞🤞🎉🎶👌🐱‍💻✔😢💕😉";
		
		unsupported = unsupported.replaceAll("[^a-zA-Z0-9]"," ");
		
		System.out.println(unsupported);

	}

}
