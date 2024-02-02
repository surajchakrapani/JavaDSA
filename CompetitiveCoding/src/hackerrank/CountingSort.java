package hackerrank;

import java.util.*;
import java.util.Map.Entry;

public class CountingSort {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1,1,3,2,1,8,9,5,6,7,8,8,8,8);
		System.out.println(countingSort(arr));

	}
	
	public static List<Integer> countingSort(List<Integer> arr) {
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i = 0;i<100;i++) {
			hm.put(i, 0);
		}
		
		for(int num:arr) {
			hm.put(num, hm.get(num) +1);
		}
		
		List<Integer> frequency = new ArrayList<>();
		for(Entry<Integer, Integer> map :hm.entrySet()) {
			Integer count = map.getValue();
			frequency.add(count);
		}
		
		return frequency;
	   
	    }

}
