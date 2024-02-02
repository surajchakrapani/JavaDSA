package leetcode.arrays_Strings;

public class Q10_JumpGame2 {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 1, 1, 4 };
		System.out.println(jump(nums));
	}

	public static int jump(int[] nums) {
		
		int jumps =0;
		int currentEnd = 0;
		int currentFarthest = 0;
		
		//loop until nums.length -1 because we want to reach only till there
		for(int i=0;i<nums.length-1;i++) {
			
			currentFarthest = Math.max(currentFarthest, i + nums[i]);
			
			if(i==currentEnd) {
				jumps++;
				currentEnd = currentFarthest;
			}
			
		}
		return jumps;
	}

}
