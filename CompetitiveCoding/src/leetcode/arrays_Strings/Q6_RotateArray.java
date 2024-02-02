package leetcode.arrays_Strings;

import java.util.Arrays;

public class Q6_RotateArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		// 7,6,5,4,3,2,1, -> 1st reverse
		// 5,6,7,4,3,2,1  -> 2nd reverse
		// 5,6,7,1,2,3,4 -> 3rd reverse
		// 5,6,7,1,2,3,4
		rotate(nums, 3);

	}

	public static void rotate(int[] nums, int k) {
	    k %= nums.length;
	    reverse(nums, 0, nums.length - 1);
	    reverse(nums, 0, k - 1);
	    reverse(nums, k, nums.length - 1);
	    System.out.println(Arrays.toString(nums));
	}

	public static void reverse(int[] nums, int start, int end) {
	    while (start < end) {
	        int temp = nums[start];
	        nums[start] = nums[end];
	        nums[end] = temp;
	        start++;
	        end--;
	    }
	}

}
