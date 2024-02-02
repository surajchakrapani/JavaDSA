package hackerrank.week2;

import java.util.*;
import java.util.Map.Entry;

public class SocksMerchant {

	public static void main(String[] args) {
		List<Integer> ar = Arrays.asList(1,2,1,2,1,3,2);
		System.out.println(sockMerchant(7,ar));
		
		

	}
	
	public static int sockMerchant(int n, List<Integer> ar) {
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i:ar) {
			hm.put(i, hm.getOrDefault(i, 0)+1);
		}
		System.out.println(hm);
		
		int pairs =0;
		
		for(Entry<Integer, Integer> entry:hm.entrySet()) {
			
			Integer value = entry.getValue();
			pairs += value/2;
		}
		return pairs;
	    }
	
	

}
