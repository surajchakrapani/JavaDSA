package leetcode.contests;

import java.util.*;
public class MinimizeStringLength {

	public static void main(String[] args) {
		System.out.println(minimizedStringLength("ipi"));

	}

	public static int minimizedStringLength(String s) {
		
		Set<Character> set = new HashSet<>();
		int i =0;
		
		while(i<s.length()) {
			set.add(s.charAt(i));
			i++;
		}
		return set.size();
	}

}
