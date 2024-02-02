package leetcode.two_pointers;

import java.util.*;

public class ThreeSum {

	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4 }; // -4,-1,-1,0,1,2
		System.out.println(threeSum(nums));

	}

	public static List<List<Integer>> threeSum(int[] nums) {

		HashSet<List<Integer>> triplets = new HashSet<>();

		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length - 2; i++) {

			int left = i+1;
			int right = nums.length - 1; 
			while (left < right) {
				int currentSum = nums[i] + nums[left] + nums[right];
				if (currentSum == 0) {
					triplets.add(Arrays.asList(nums[i], nums[left], nums[right]));
					left++;
					right--;
				}
				else if (currentSum < 0) {
					left++;
				}else {
					right--;
				}
			}
		}

		List<List<Integer>> tripletsList = new ArrayList<>(triplets);
		return tripletsList;
	}

}
