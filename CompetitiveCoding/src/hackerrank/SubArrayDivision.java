package hackerrank;

import java.util.*;

public class SubArrayDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> s = Arrays.asList(2,2,1,3,2);
		
		System.out.println(birthday(s,4,2));

	}
	
	public static int birthday(List<Integer> s, int d, int m) {
	    
		int output = 0;
		
		int sum = 0;
		
		for(int i=0;i<=s.size()-m;i++) {
			for(int j =0;j<m;j++) {
				sum = sum + s.get(j+i);
			}
			
			if(sum ==d) {
				output++;
			}	
			sum =0;
		}
		
		
		return output;
	    }
	

}
