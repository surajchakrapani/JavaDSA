package leetcode.arrays_Strings;

import java.util.Arrays;
import java.util.Collections;

public class Q21_ReverseWordsInAString {

	public static void main(String[] args) {
		System.out.println(reverseWords("      a good   example     "));
	}

	public static String reverseWords(String s) {
		
		String[] str = s.trim().split(" +");
		Collections.reverse(Arrays.asList(str));
		return String.join(" ", str);
	}

}
