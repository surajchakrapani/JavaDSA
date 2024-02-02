package leetcode.arrays_Strings;

public class Q18_IntegerToRoman {

	public static void main(String[] args) {
		
		System.out.println(intToRoman(3871));
	}

	//1 <= num <= 3999
	public static String intToRoman(int num) {
				
		String[] ones = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String[] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String[] hundreds = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String[] thousands = {"","M","MM","MMM"};
		
		return thousands[num/1000] + hundreds[num%1000/100] + tens[num%100/10] + ones[num%10];
	}

}
