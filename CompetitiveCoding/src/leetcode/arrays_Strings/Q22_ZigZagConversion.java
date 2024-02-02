package leetcode.arrays_Strings;

public class Q22_ZigZagConversion {

	public static void main(String[] args) {
		System.out.println(convert("PAYPALISHIRING",4)); 
		
		//PINALSIGYAHRPI           PAHNAPLSIIGYIR
		
		//P     I    N				P   A   H   N
		//A   L S  I G				A P L S I I G
		//Y A   H R					Y   I   R
		//P     I

	}

	public static String convert(String s, int numRows) {
		
		if(numRows == 1) return s;
        int cycle = numRows * 2 - 2;
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<numRows;i++){
            for(int j = i,k = cycle-i;j<s.length();j+=cycle,k+=cycle){
                sb.append(s.charAt(j));
                if(i!= 0 && j!= k && k<s.length()) //1st row, i = 0; last row, j == k; we must avoid adding twice
                    sb.append(s.charAt(k));
            }
        }
        return sb.toString();
	}

}
