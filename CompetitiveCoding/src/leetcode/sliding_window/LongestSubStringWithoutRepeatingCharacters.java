package leetcode.sliding_window;

import java.util.*;

public class LongestSubStringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("pwwkew"));//3
	}

	//https://leetcode.com/problems/longest-substring-without-repeating-characters/solutions/2133524/java-c-a-reall-detailed-explanation/
	public static int lengthOfLongestSubstring(String s) {
		
		int max = 0;
		int i=0;
		int j=0;
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		while(j<s.length()){
			char key = s.charAt(j);
			map.put(key, map.getOrDefault(key, 0) + 1);
			if(map.size()==j-i +1) {
				max=Math.max(max, j-i+1);
				j++;
			}else if(map.size()<j-i+1) {
				while(map.size()<j-i+1) {
					map.put(s.charAt(i), map.get(s.charAt(i))-1);
					if(map.get(s.charAt(i))==0) {
						map.remove(s.charAt(i));
					}
					i++;
				}
				j++;
			}
		}
		
		return max;
	}

}
