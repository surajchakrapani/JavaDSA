package leetcode.hashmap;

import java.util.*;

public class ValidAnagram {

	public static void main(String[] args) {
		
		System.out.println(isAnagram("anagram","nagarama"));

	}

	public static boolean isAnagram(String s, String t) {
		
		HashMap<Character,Integer> hm = new HashMap<>();
		
		if(s.length()!=t.length()) {
			return false;
		}
		
		for(char c:s.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		for(char c:t.toCharArray()) {
			if(!hm.containsKey(c) || hm.get(c)==0 ) {
				return false;
			}else {
				hm.put(c, hm.get(c)-1);
			}
		}

		return true;
	}

}
