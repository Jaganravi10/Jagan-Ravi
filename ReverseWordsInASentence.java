
public class ReverseWordsInASentence {

	public static void main(String[] args) {

		String given = "I will Acheive";

		String reversed = "";

		String[] temporary=given.split(" ");
		
		System.out.println(temporary.length);

		for(int i=temporary.length-1; i>=0; i--) {
			
			reversed=reversed+temporary[i]+" ";
			
		}
		
		System.out.println(reversed);
	}

}
