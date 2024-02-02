package hackerrank.week2;

import java.util.*;

public class SherlockAndArray {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(5, 6, 6, 13);
		System.out.println(balancedSums(arr));

	}

	public static String balancedSums(List<Integer> arr) {

		int before = 0;
		int after = 0;

		for (int i = 1; i < arr.size(); i++) {
			after += arr.get(i);
		}

		for (int i = 0; i < arr.size(); i++) {
			if (before == after) {
				return "YES";
			} else if (i + 1 < arr.size()) {
				before += arr.get(i);
				after -= arr.get(i + 1);
			} else {
				before += arr.get(i);
			}

		}

		return "NO";
	}

}
