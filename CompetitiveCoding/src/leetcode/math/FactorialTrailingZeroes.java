package leetcode.math;

public class FactorialTrailingZeroes {

	public static void main(String[] args) {
		System.out.println(trailingZeroes2(35));
	}

	//10000
	public static int trailingZeroes(int n) {
		
		int zeroes = n/5 + n/25 + n/125 + n/625 + n/3125;
		
		return zeroes;
	}
	
	public static int trailingZeroes2(int n) {
	return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
	}

}
