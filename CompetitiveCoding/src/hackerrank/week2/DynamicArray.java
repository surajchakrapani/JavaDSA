package hackerrank.week2;

import java.util.*;

public class DynamicArray {

	public static void main(String[] args) {
		
		
	}
	
	public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
		  // Declare a 2-dimensional array, arr
        List<List<Integer>> arr = new ArrayList<>();
        for (int i=0;i<n;i++) {
            arr.add(new ArrayList<>());
        }

        // Declare an integer, last Answer, and initialize it to 0.
        int lastAnswer = 0;

        // Declare an answerArray
        List<Integer> answerArray = new ArrayList<>();

        for (List<Integer> query : queries) {

            // here are 2 types of queries, given as an array of strings for you to parse:
            if (query.get(0).equals(1)) {
                // if it starts with 1, it's type 1

                // Let idx =( ( x ^ lastAnsuer) %n
                int idx = ( query.get(1) ^ lastAnswer) % n;

                // append the integer to arr[idx]
                arr.get(idx).add( query.get(2) );


            } else {
                // if it starts with 2, it's type 2

                // let idx =( ( x ^ lastAnsuer) %n
                int idx = ( query.get(1) ^ lastAnswer) % n;

                // assign the value arr[idx][ y % size (arr[idx])] to lastAnswer.
                lastAnswer = arr.get(idx).get( query.get(2) % arr.get(idx).size() );

                // Store the new value of lastAnswer to an answers array.
                answerArray.add(lastAnswer);

            }

        }


        return answerArray;
	    }

}
