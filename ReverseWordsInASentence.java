
public class ReverseWordsInASentence {

	public static void main(String[] args) {
		
		String given = "I Love Learning Very Much";
		String reversed = "";
		String[] temp = given.split(" ");

		for(int i =temp.length-1; i>=0;i--) {
			reversed=reversed+temp[i]+" ";
		}
		System.out.println(reversed);
	}

}
