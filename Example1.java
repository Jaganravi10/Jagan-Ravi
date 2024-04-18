import java.util.Arrays;

public class Example1 {

	public static void oddEvenNumber() {

		int givenNumber = 7;

		if (givenNumber % 2 == 0) {
			System.out.println("Even number");

		} else {
			System.out.println("Odd number");
		}

	}

	public static void numberReverse() {

		int anotherGiven = 12345;
		int expected = 0;

		while (anotherGiven != 0) {
			expected = expected * 10 + anotherGiven % 10;
			anotherGiven = anotherGiven / 10;
		}
		System.out.println(expected);
	}

	public static void wordsReverse() {

		String current = "This is simple";
		String expected = "";

		String[] chararr = current.split(" ");

		for (int i = chararr.length - 1; i >= 0; i--) {
			expected = expected + chararr[i] + " ";
		}
		System.out.println(expected.toLowerCase());
	}

	public static void givenArray() {
		
		String[] arrFurit = new String[5];
		arrFurit[0] = "Mango";
		arrFurit[1] = "Grape";
		arrFurit[2] = "Orange";
		arrFurit[3] = "Apple";
		arrFurit[4] = "Melon";
		
		arrFurit[3]= "Berries";
		
		System.out.println(Arrays.toString(arrFurit));
		
	}

	public static void main(String[] args) {

		givenArray();

	}

//		String giv = "Hope";
//		String rev = "";
//		
//		char [] tem = giv.toCharArray();
//		
//		for(int i = giv.length()-1; i>=0; i--) {
//			rev = rev+tem[i];
//		}
//		System.out.println(rev);
//	}

}
