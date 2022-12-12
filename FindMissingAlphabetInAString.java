import java.util.Arrays;
import java.util.HashSet;

public class FindMissingAlphabetInAString {

	public static void main(String[] args) {

		String given = "abcd";

		given.toLowerCase();

		given.replaceAll(" ", "");

		String[] array=given.split("");

		String[] alphabets="abcdefghijklmnopqrstuvwxyz".split("");

		HashSet<String> set1=new HashSet<String>(Arrays.asList(array));

		HashSet<String> set2=new HashSet<String>(Arrays.asList(alphabets));

		set2.removeAll(set1);
		
		System.out.println(set2);
	}

}
