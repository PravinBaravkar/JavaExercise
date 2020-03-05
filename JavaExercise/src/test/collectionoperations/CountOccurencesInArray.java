package test.collectionoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CountOccurencesInArray {

	public static void main (String []args) {
		
		String []arr1 = {"India","US","China","India"};
		String []arr2 = {"Canada", "France", "India", "US"};
		
		ArrayList<String> mergedArray1 = new ArrayList<String>(Arrays.asList(arr1));
		mergedArray1.addAll(Arrays.asList(arr2));
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for (String country : mergedArray1) {
			int count = 1;
			if (map.containsKey(country)) {
				count = map.get(country);
				map.put(country, ++count);
				
			}
			else {
				map.put(country, count);
			}
		}
	
		for (Entry<String, Integer> hm : map.entrySet()) {
			System.out.println(hm.getKey() + ":" + hm.getValue());
		}
	}
}
