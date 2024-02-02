package hackerrank.week2;

public class SuperDigit {

	public static void main(String[] args) {

		String n = "9875987598759875";
		System.out.println(superDigit("148", 3));

	}

	public static int superDigit(String n, int k) {

		int digitSum = 0;

		for (int i = 0; i < n.length(); i++) {
			digitSum = digitSum + Integer.valueOf(String.valueOf(n.charAt(i)));
		}

		if (digitSum < 9) {
			return digitSum;

		} else {
			String sum = String.valueOf(digitSum);
			return superDigit(sum,sum.length());
		}
	}

}
