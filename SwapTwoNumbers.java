
public class SwapTwoNumbers {

	public void withThirdVariable() {

		int mine=20000;
		int his=50000;

		System.out.println("Before swapping mine is:"+mine +" and his is "+ his);

		int temp=mine;
		mine=his;
		his=temp;

		System.out.println("After swapping mine is:"+mine +" and his is "+ his);
	}

	public void withoutThirdVariable() {

		/*first=first-second second=first+second first=second-first

		first=first*second second=first/second first=first/second*/

		int first=20;
		int second=50;

		System.out.println("Before swapping mine is:"+first +" and his is "+ second);

		first=first-second;
		second=first+second;
		first=second-first;

		System.out.println("After swapping mine is:"+first +" and his is "+ second);

	}

	public static void main(String[] args) {

		SwapTwoNumbers numbers=new SwapTwoNumbers();
		numbers.withoutThirdVariable();

	}

}
