package leetcode.hashmap;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {

	public static void main(String[] args) {

		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(groupAnagrams(strs));
	}

	public static List<List<String>> groupAnagrams(String[] strs) {

		Map<String,List<String>> groupedAnagrams = new HashMap<>();
		
		for(String word:strs) {
			char[] letters = word.toCharArray();
			Arrays.sort(letters);
			String sortedStr = String.valueOf(letters);
			if(!groupedAnagrams.containsKey(sortedStr)) {
				groupedAnagrams.put(sortedStr,new ArrayList());
			}
			groupedAnagrams.get(sortedStr).add(word);
		}
		
		return new ArrayList<>(groupedAnagrams.values());
	}

}
