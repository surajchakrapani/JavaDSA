package leetcode.arrays_Strings;

import java.util.*;

public class Q3_RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
		System.out.println(removeDuplicates(nums));

	}

	public static int removeDuplicates(int[] nums) {

		int i = 1;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] > nums[j-1]) {
				nums[i]=nums[j];
				i++;
			}
		}
		
		//System.out.println(Arrays.toString(nums));
		return i;
	}

}
