package test.collectionoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class MergeArrayWithoutDuplicate {
	
	public static void main(String []args) {
		
		String []arr1 = {"India","US","China","India"};
		String []arr2 = {"Canada", "France", "India", "US"};
		
		Set<String> uniqueList = new HashSet<String>(Arrays.asList(arr1));
		uniqueList.addAll(Arrays.asList(arr2));
		System.out.println(uniqueList);
		TreeSet<String> sortedOrder = new TreeSet<>(uniqueList);
		System.out.println(sortedOrder);
		
		Iterator<String> desc = sortedOrder.descendingIterator();
		while(desc.hasNext()) {
			System.out.print(desc.next()+ ",");
		}
	
    } 

	}
