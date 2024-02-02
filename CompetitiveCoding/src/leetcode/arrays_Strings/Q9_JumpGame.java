package leetcode.arrays_Strings;

public class Q9_JumpGame {

	public static void main(String[] args) {
		int[] nums = {2,3,1,1,4};
		System.out.println(canJump(nums));

	}

	public static boolean canJump(int[] nums) {
		
		int reachable = 0;
		 for(int i=0;i<nums.length && i<=reachable;i++) {
			 reachable = Math.max(reachable, i + nums[i]);
			 
			 if(reachable>=nums.length-1) {
				 return true;
			 }
			 
		 }
		return false;
	}

}
