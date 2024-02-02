package leetcode.contests;

public class SemiOrderedPermutation {

	public static void main(String[] args) {
		int[] nums = {2,1,4,3}; //2,1,4,3
		System.out.println(semiOrderedPermutation(nums));
	}

	public static int semiOrderedPermutation(int[] nums) {
		
		int i =0;
		int j =0;
		
		for(int n=0;n<nums.length;n++) {	
			if(nums[n]==1) {
				i = n;
			}	
			if(nums[n]==nums.length) {
				j = n;
			}
		}
		
		
		return j>i?i+(nums.length -j)-1:i+(nums.length -j)-2;
	}

}
