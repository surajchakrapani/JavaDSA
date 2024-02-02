package leetcode.arrays_Strings;
import java.util.*;

public class Q5_MajorityElement {

	public static void main(String[] args) {
		int[] nums =  {2,2,1,1,1,2,2};
		System.out.println(majorityElement(nums));
		System.out.println(majorityElements(nums));

	}

	public static int majorityElement(int[] nums) {
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i:nums) {
			hm.put(i, hm.getOrDefault(i, 0)+1);
		}
		for(Map.Entry<Integer, Integer> map:hm.entrySet()) {
			Integer val = map.getValue();
			Integer key = map.getKey();
			if(val>nums.length/2) {
				return key;
			}
		}
		return 0;
	}
	
	public static int majorityElements(int[] nums) {
		int count = 0; int major = nums[0];
		for(int i:nums) {
			if(count==0){
				major=i;
				count++;
				}
			else if(i==major) {
				count++;
			}
			else count--;
		}
		return major;
	}

}
