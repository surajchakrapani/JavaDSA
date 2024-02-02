package hackerrank.week2;

import java.util.*;

public class GridChallenge {

	public static void main(String[] args) {

		List<String> grid = Arrays.asList("bcd","stu","jki");
		System.out.println(gridChallenge(grid));

	}
	
	public static String gridChallenge(List<String> grid) {
		
		
		char[][] sortedGrid = new char[grid.size()][grid.get(0).length()];
		
		for(int i=0;i<grid.size();i++) {
			char[] array = grid.get(i).toCharArray();
			Arrays.sort(array);
			sortedGrid[i]= array;	
		}
		
		for(int col=0;col<sortedGrid[0].length;col++) {
			for(int row =1; row<sortedGrid.length;row++) {
				if(sortedGrid[row-1][col]>sortedGrid[row][col]) {
					return "NO";
				}
			}
		}
			
			return "YES";
	    }

}
