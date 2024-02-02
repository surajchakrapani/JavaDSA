package hackerrank;
import java.util.*;

public class FlippingMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int flippingMatrix(List<List<Integer>> matrix) {
        int sum = 0;
        int length = matrix.size();
        for(int row=0;row<length/2;row++){
            for(int column=0;column<matrix.size()/2;column++){
                sum+=Math.max(matrix.get(row).get(column),
                    Math.max(matrix.get(row).get(length-1-column),
                    Math.max(matrix.get(length-1-row).get(column),
                    matrix.get(length-1-row).get(length-1-column))));
            }
        }
        return sum;
    }

}
