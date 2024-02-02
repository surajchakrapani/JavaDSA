package leetcode.arrays_Strings;

import java.util.Arrays;

public class Q1_MergeSortedArray {

	public static void main(String[] args) {
		//nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		merge(nums1,3,nums2,3); //1,2,2,3,5,6

	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
		int p1=m-1;
		int p2=n-1;
		int i = m + n -1;
		
		while(p2>=0) {
			if(p1>=0 && nums1[p1]>nums2[p2]) {
				nums1[i--]=nums1[p1--];
			}else {
				nums1[i--]=nums2[p2--];
			}
		}
		System.out.println(Arrays.toString(nums1));
        
    }

}
