package leetcode.hashmap;

import java.util.*;

public class WordPattern {

	public static void main(String[] args) {

		System.out.println(wordPattern("abba", "dog cat cat dog"));

	}

	public static boolean wordPattern(String pattern, String s) {

		HashMap<Character, String> hm = new HashMap<>();

		String[] str = s.split(" ");

		if (pattern.length() != str.length) {
			return false;
		}

		for (int i = 0; i < pattern.length(); i++) {
			if (hm.containsKey(pattern.charAt(i))) {
				if (!hm.get(pattern.charAt(i)).equals(str[i])) {
					return false;
				}
			}else if(hm.containsValue(str[i])) {
				return false;
			}
			else {
				hm.put(pattern.charAt(i), str[i]);
			}
		}

		return true;

	}

}
