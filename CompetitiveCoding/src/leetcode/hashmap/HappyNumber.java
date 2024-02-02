package leetcode.hashmap;

import java.util.*;

public class HappyNumber {

	public static void main(String[] args) {
		System.out.println(isHappy(19));
	}

	public static boolean isHappy(int n) {

		if (n * n == 1) {
			return true;
		}

		HashSet<Integer> set = new HashSet<>();

		while (true) {

			int m = 0;

			while (n != 0) {
				m = m + (n % 10) * (n % 10);
				n = n / 10;
			}
			if (m == 1) {
				return true;
			}
			if (!set.add(m)) {
				return false;
			}
			n = m;
		}

	}

}
