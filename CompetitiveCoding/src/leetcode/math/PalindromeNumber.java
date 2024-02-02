package leetcode.math;

public class PalindromeNumber {

	public static void main(String[] args) {

		System.out.println(isPalindrome(121));
	}

	public static boolean isPalindrome(int x) {
		
		int num = 0;
		int rem =0;
		int temp = x;
		
		while(temp>0) {
			rem = temp%10 ;
			temp=temp/10;
			num=(num*10)+rem;
		}
		
		return x==num;
	}

}
