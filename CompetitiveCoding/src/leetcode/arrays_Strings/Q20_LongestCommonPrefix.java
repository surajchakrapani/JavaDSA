package leetcode.arrays_Strings;

import java.util.Arrays;

public class Q20_LongestCommonPrefix {

	public static void main(String[] args) {
		
		String[] strs = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
	}

	public static String longestCommonPrefix(String[] strs) {
		
		Arrays.sort(strs);
		//System.out.println(Arrays.toString(strs));
		
		String first = strs[0];
		String last = strs[strs.length-1];
		
		int c=0;
		
		for(int i=0;i<first.length();i++) {
			if(first.charAt(i)==last.charAt(i)) {
				c++;
			}else {
				break;
			}
		}
		
		return c==0 ? "" : first.substring(0, c);
	}

}
