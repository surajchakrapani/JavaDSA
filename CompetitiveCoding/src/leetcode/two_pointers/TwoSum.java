package leetcode.two_pointers;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2,3,4,13,14,17};
		System.out.println(Arrays.toString(twoSum(numbers,6)));
	}

	public static int[] twoSum(int[] numbers, int target) {
		
		int left= 0;
		int right = numbers.length -1;
		
		while(left<right) {
			
			int l = numbers[left];
			int r = numbers[right];
			if(l+r == target) {
				return new int[] {left +1 , right +1};
			}else if(l+r < target) {
				left++;
			}else {
				right--;
			}
		}
		
		return new int[] {};
	}

}
