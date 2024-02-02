package hackerrank.week2;

public class SumVsXor {

	public static void main(String[] args) {
		System.out.println(sumXor(5));

	}
	
	

	private static long sumXor(int n) {
		
		if (n == 0) return 1;
	    
	    String binary = Long.toBinaryString(n);
	    System.out.println(binary);
	    int zeros = (int) binary.chars()
	                    .filter(ch -> ch == '0').count();
	    return (long) Math.pow(2, zeros);
		
		
	}



	public static long sumXor2(long n) {

		long total = 0;
		long sum = 0;
		long xor = 0;


		for (long i = 0; i <= n; i++) {
			sum = n + i;
			xor = n ^ i;

			if (sum == xor) {
				total++;
			}

		}

		return total;
	}

}
