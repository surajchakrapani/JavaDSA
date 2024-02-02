package hackerrank.week1;

import java.util.*;

public class Pangram {

	public static void main(String[] args) {

		String s = "abcdefghijkl   mnopqrstuvwxyz";
		System.out.println(pangrams(s));

	}

	public static String pangrams(String s) {
		// Write your code here

		HashMap<Character, Integer> hm = new HashMap<>();

		for (char c = 97; c <= 122; c++) {
			hm.put(c, 0);
		}
		
		System.out.println(hm);

		for (int i = 0; i < s.length(); i++) {
			char c = s.toLowerCase().charAt(i);

			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}
		
		System.out.println(hm);

		if (hm.containsValue(0)) {
			return "not pangram";
		} else {

			return "pangram";
		}
	}

}
