
public class StringReverseAllWays {

	public static void main(String[] args) {

		/*String given="Automation";
		StringBuilder reverse=new StringBuilder();
		reverse.append(given);
		System.out.println(reverse.reverse());

		String s1="Selenium";
		StringBuffer reverse=new StringBuffer();
		reverse.append(s1);
		System.out.println(reverse.reverse());*/

		String str="Great";
		char[] chararray=str.toCharArray();
		String reverse="";
		for(int i=chararray.length-1;i>=0;i--) {
		reverse=reverse+chararray[i];
		}
		System.out.println(reverse);
	}

}
