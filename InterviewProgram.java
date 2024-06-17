
public class InterviewProgram {

	public static void main(String[] args) {
		
		//Output: emocleW ot ym dlroW
		
		String givenSentence = "Welcome to my World";
		String temp = "";
		
		String[] charSentence = givenSentence.split(" ");
		
		for(int i=0; i<=charSentence.length-1; i--) {
			
			temp=temp+charSentence[i]+" ";
		}
		System.out.println(temp);
		
	}

}
