package test.collectionoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import com.sun.org.apache.bcel.internal.generic.NEWARRAY;

public class MergeArray {

	public static void main(String args[]) {
		
		String []arr1 = {"India","US","China","India"};
		String []arr2 = {"Canada", "France", "India", "US"};
		
		String [] mergedArr = new String[arr1.length+arr2.length];
		
		int count = arr1.length;
		
		for (int i = 0; i < arr1.length; i++) {
			mergedArr[i] = arr1[i];
		}
		
		for (int i = 0; i < arr2.length; i++) {
			mergedArr[count] = arr2[i];
			count++;
		}
		
		for (String element : mergedArr)
			System.out.print(element + " ");
		
		System.out.println("Another way : \n");
		
		ArrayList<String> mergedArray1 = new ArrayList<String>(Arrays.asList(arr1));
		mergedArray1.addAll(Arrays.asList(arr2));
		
		for (String elem : mergedArray1) {
			System.out.print(elem + " ");
		}
		
	}
		
}
	
