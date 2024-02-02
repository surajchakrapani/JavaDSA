package leetcode.sliding_window;

public class MinimumSizeSubArraySum {

	public static void main(String[] args) {

		int[] nums = { 2, 3, 1, 2, 4, 3 }; // 1,2,2,3,3,4
		System.out.println(minSubArrayLen(7, nums));
	}

	public static int minSubArrayLen(int target, int[] nums) {

		int start = 0;
		int end = 0;
		int sum = 0;
		int min = Integer.MAX_VALUE;

		while (end < nums.length) {
			sum += nums[end++];

			while (sum >= target) {
				min = Math.min(min, end - start);
				sum -= nums[start++];
			}
		}

		return min == Integer.MAX_VALUE ? 0 : min;
	}

}
