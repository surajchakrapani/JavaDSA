package geeksForGeeks;

import java.util.*;
import java.util.Map.Entry;

public class CheckSubSequence {

	public static void main(String[] args) {
		String input = "KOTTAYAM";
		String target = "KOA";

		System.out.println(checkforSubsequence(input, target));
		// true
	}

	private static boolean checkforSubsequence(String input, String target) {

		Map<Character, Integer> hm = new HashMap<>();
		for (char c : input.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}
		
		for(int i=0;i<target.length();i++) {
			char value = target.charAt(i);
			if(hm.containsKey(value) && hm.get(value)!=0) {
				hm.put(target.charAt(i), hm.get(value) - 1);
			}else {
				return false;
			}
		}
		return true;
	}

}
