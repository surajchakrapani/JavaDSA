package hackerrank.week1;

import java.util.*;

public class XorString {

	public static void main(String[] args) {

		System.out.print("1st string: ");
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		
		System.out.print("2nd string: ");
		String str2 = sc.nextLine();
		
		System.out.println(xorString(str1,str2));
		

	}

	private static String xorString(String str1, String str2) {
		// TODO Auto-generated method stub
		
		StringBuilder output = new StringBuilder();
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)==str2.charAt(i)) {
				output.append("0"); 
			}else {
				output.append("1");
			}
		}
		return output.toString();
	}

}
