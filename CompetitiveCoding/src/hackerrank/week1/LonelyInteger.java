//Given an array of integers, where all elements but one occur twice, find the unique element.

package hackerrank.week1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class LonelyInteger {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 3, 2, 1);
		System.out.println(lonelyinteger(list));

	}

	public static int lonelyinteger(List<Integer> a) {

		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int n : a) {
			hm.put(n, hm.getOrDefault(n, 0) + 1);
		}
		
		System.out.println(hm);

		for(int n:a) {
			if(hm.get(n) == 1) {
				return n;
			}
		}

		return 0;
	}

}
