package leetcode.math;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int[] digits = {9,9,9,9}; //4321
		System.out.println(Arrays.toString(plusOne(digits)));

	}

	public static int[] plusOne(int[] digits) {
		
		for(int i = digits.length -1;i>=0;i--) {
			if(digits[i]<9) {
				digits[i] += 1;
				return digits;
			}
			digits[i] = 0;
		}
		
		int[] output = new int[digits.length + 1];
		output[0] = 1;
		return output;
	}

}
