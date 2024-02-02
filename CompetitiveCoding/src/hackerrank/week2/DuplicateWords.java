package hackerrank.week2;

import java.util.*;
import java.util.Map.Entry;
public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I am from bangalore and I am from Hyderbad";
		
		String[] array = s.split(" ");
		HashMap<String,Integer> map = new HashMap<>();
		for(String str:array) {
			map.put(str, map.getOrDefault(str, 0) + 1);
		}
		System.out.println(map);
		
		for(Entry<String, Integer> entry:map.entrySet()) {
			Integer value = entry.getValue();
			if(value>1) {
				System.out.print(entry.getKey() + " ");
			}
		}
	}

}
