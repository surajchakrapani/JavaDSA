package leetcode.arrays_Strings;

import java.util.Arrays;
import java.util.List;

public class Q2_RemoveElement {

	public static void main(String[] args) {

		int[] nums = {3,2,2,3};
		System.out.println(removeElement(nums,3));
	}

	public static int removeElement(int[] nums, int val) {
		
		int i =0;
		
		for(int j=0;j<nums.length;j++) {
			if(nums[j]!=val) {
				int temp = nums[i];
				nums[i]=nums[j];
				nums[j]=temp;
				i++;
			}
		}
		
		
		return i;
	}

}
