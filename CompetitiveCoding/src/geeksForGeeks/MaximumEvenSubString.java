package geeksForGeeks;

public class MaximumEvenSubString {

	public static void main(String[] args) {
		int a[] = {-2, 2, -3, 1};
        
        System.out.println(maxEvenSum(a, a.length));   
 
	}

	private static int maxEvenSum(int[] array, int length) {
		
		int sum = 0;
		
		
		for(int num:array) {
			if(num>0) {
				sum += num;
			}
		}
		if(sum%2==0) {
			return sum;
		}
		
		int maxOddNegative = Integer.MIN_VALUE;
		int minOddPositive = Integer.MAX_VALUE;
		
		for(int num:array) {
			if(num>0 && num % 2 != 0 && num<minOddPositive) {
				minOddPositive = num;
			}else if(num<0 && num %2 != 0 && num>maxOddNegative) {
				maxOddNegative = num;
			}
		}
		if(sum%2 != 0 ) {
			int a =sum - minOddPositive;
			int b = sum + maxOddNegative;
			return a>b?a:b;
		}
		
		return 0;
	}

}
