package leetcode.contests;

public class CountOfIntegers {

	public static void main(String[] args) {
		System.out.println(count("1000000007","2000000014",1,400));


	}

	public static int count(String num1, String num2, int min_sum, int max_sum) {
		
		int n1=Integer.valueOf(num1);
		int n2=Integer.valueOf(num2);
		
		int count=0;
		
		for(int i=n1;i<=n2;i++) {
			
			int num = i;
			int digitSum=0;
			while(num>0) {
				digitSum=digitSum+num%10;
				num=num/10;
			}
			
			if(digitSum>=min_sum && digitSum<=max_sum) {
				count++;
			}
			
		}

		return count;
	}

}
