package hackerrank.week1;

import java.util.*;
import java.util.stream.Collectors;

public class PermutingTwoArray {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(2, 1, 3);
		List<Integer> B = Arrays.asList(7, 8, 9);

		System.out.println(twoArrays(10, A, B));

	}

	public static String twoArrays(int k, List<Integer> A, List<Integer> B) {

		List<Integer> sortedA = A.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedA);
		List<Integer> reverseB = B.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseB);

		for (int i = 0; i < A.size(); i++) {

			if (sortedA.get(i) + reverseB.get(i) < k) {
				return "NO";
			}
		}

		return "YES";
	}

}
