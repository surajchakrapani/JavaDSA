package geeksForGeeks;
import java.util.*;

public class RemoveDuplicateLetters {

	public static void main(String[] args) {
		
		 // Given string S
	    String S = "acbcdfeccc";
	 
	    // Function Call
	    System.out.println(removeDuplicateLetters(S));
	}

	private static String removeDuplicateLetters(String str) {
		
		HashSet<Character> set = new HashSet<>();
		for(char c:str.toCharArray()) {
			set.add(c);
		}
		return set.toString();
	}

}
