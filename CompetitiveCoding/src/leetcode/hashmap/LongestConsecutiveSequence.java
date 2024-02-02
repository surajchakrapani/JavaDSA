package leetcode.hashmap;

import java.util.*;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {

		int[] nums = { 100, 4, 200, 1, 3, 2 };
		System.out.println(longestConsecutive(nums));

	}

	public static int longestConsecutive(int[] nums) {

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}

		int max = 0;

		for (int n = 0; n < nums.length; n++) {
			
			int count = 1;

			// left lookup
			int num = nums[n];
			while (set.contains(--num)) {
				count++;
				set.remove(num);
			}

			//right lookup
			num = nums[n];
			while (set.contains(++num)) {
				count++;
				set.remove(num);
			}

			max = Math.max(max, count);
			
		}
		return max;
	}

}
