//Given a square matrix, calculate the absolute difference between the sums of its diagonals.

package hackerrank.week1;

import java.util.*;

public class DiagonalDifference {

	public static void main(String[] args) {
		List<List<Integer>> arr = new ArrayList<>();
		List<Integer> a1 = Arrays.asList(1,2,3);
		List<Integer> a2 = Arrays.asList(1,2,3);
		List<Integer> a3 = Arrays.asList(1,2,9);
		arr.add(a1);
		arr.add(a2);
		arr.add(a3);
		System.out.println(diagonalDifference(arr));
		

	}

	public static int diagonalDifference(List<List<Integer>> arr) {
		
		int d1 =0;
		int d2 =0;
		
		int numRows = arr.size();
		int numColumns = arr.get(0).size();
		
		for(int i=0;i<numRows;i++) {
			
			d1 += arr.get(i).get(i);
			d2 += arr.get(i).get(numColumns -1-i);
		}
		
		
		return Math.abs(d2-d1);

	}

}
