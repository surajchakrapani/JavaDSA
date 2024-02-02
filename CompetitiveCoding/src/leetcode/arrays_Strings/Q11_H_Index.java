package leetcode.arrays_Strings;

import java.util.Arrays;

public class Q11_H_Index {

	public static void main(String[] args) {
		int[] citations  = {1,3,1};
		System.out.println(hIndex(citations));
	

	}

	public static int hIndex(int[] citations) {
		
		int total= citations.length;
		int index  = 0;
		
		Arrays.sort(citations); //0,1,3,5,6
		
		for(int i =0;i<total;i++) {
			
			if(citations[i]>i) {
				index++;
			}
			
		}
		return index;
	}

}
