//There is a collection of input strings and a collection of query strings. 
//For each query string, determine how many times it occurs in the list of input strings. 
//Return an array of the results.

package hackerrank.week1;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class QueryArray {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("ab", "ab", "abc");
		List<String> queries = Arrays.asList("ab", "abc", "abd");
		System.out.println(matchingStrings(strings, queries));

	}

	/*
	 * Complete the 'matchingStrings' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * following parameters: 1. STRING_ARRAY strings 2. STRING_ARRAY queries
	 */

	public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
		
		return queries.stream().map(query -> strings.stream().filter(string -> string.equals(query)).count())
				.map(count -> Math.toIntExact(count)).collect(Collectors.toList());
	}
	
	public static List<Integer> matchingStrings2(List<String> strings, List<String> queries) {
        HashMap<String, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (String string: strings) {
            map.put(string, map.getOrDefault(string, 0) + 1);
        }
        for (String query: queries) {
            result.add(map.getOrDefault(query, 0));
        }
        return result;
    }

	//10 test cases failed
	public static List<Integer> matchingStrings3(List<String> strings, List<String> queries) {

		LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();

		for (String str : queries) {
			if (!hm.containsKey(str)) {
				hm.put(str, 0);
			}
		}

		for (String str : strings) {
			if (hm.containsKey(str)) {
				hm.put(str, hm.get(str) + 1);
			}
		}

		List<Integer> list = new ArrayList<>();
		for (Entry<String, Integer> output : hm.entrySet()) {
			Integer val = output.getValue();
			list.add(val);
		}

		return list;

	}

}
