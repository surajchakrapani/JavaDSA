package leetcode.hashmap;

import java.util.*;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {3,2,4};
		System.out.println(Arrays.toString(twoSum(nums,6)));

	}

	public static int[] twoSum(int[] nums, int target) {
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		int[] result = new int[2];
		
		for(int i=0;i<nums.length;i++) {
			if(hm.containsKey(target-nums[i])) {
				result[0]= i;
				result[1] = hm.get(target-nums[i]);
				return result;			
			}
			hm.put(nums[i], i);
		}
		
		return new int[] {};
	}

}
