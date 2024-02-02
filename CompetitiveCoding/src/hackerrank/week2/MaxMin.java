package hackerrank.week2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMin {

	public static void main(String[] args) {

		List<Integer> arr = Arrays.asList(1, 4, 7, 2);
		System.out.println(maxMin(2, arr));
	}

	/*
	 * Complete the 'maxMin' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER k 2. INTEGER_ARRAY arr
	 */

	public static int maxMin(int k, List<Integer> arr) {

		arr.sort(Comparator.naturalOrder());
		System.out.println(arr);

		int min = Integer.MAX_VALUE;
		int temp = 0;

		for (int i = 0, j = k - 1; j < arr.size(); i++, j++) {

			temp = arr.get(j) - arr.get(i);

			if (temp < min) {
				min = temp;
			}
		}

		return min;
	}

}
