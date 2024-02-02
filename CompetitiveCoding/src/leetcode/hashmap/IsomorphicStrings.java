package leetcode.hashmap;

import java.util.*;

public class IsomorphicStrings {

	public static void main(String[] args) {
		System.out.println(isIsomorphic("paper","title"));
	}

	public static boolean isIsomorphic(String s, String t) {
		
		HashMap<Character,Character> hm = new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			
			if(hm.containsKey(s.charAt(i))) {
				if(hm.get(s.charAt(i))!=t.charAt(i)) {
					return false;
				}
				
			}else if(hm.containsValue(t.charAt(i))) {
				return false;
				
			}else {
				hm.put(s.charAt(i), t.charAt(i));
			}
		
		}
		return true;
	}

}
