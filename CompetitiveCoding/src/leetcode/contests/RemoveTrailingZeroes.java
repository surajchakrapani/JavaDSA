package leetcode.contests;

public class RemoveTrailingZeroes {

	public static void main(String[] args) {
		String num = "51230100";// 512301
		System.out.println(removeTrailingZeros(num));

	}

	public static String removeTrailingZeros(String num) {

		String result = num;

		for (int i = num.length() - 1; i >= 0; i--) {
			if (num.charAt(i) == '0') {
				result = result.substring(0, i);
			} else {
				return result;
			}
		}
		return result;
	}

}
