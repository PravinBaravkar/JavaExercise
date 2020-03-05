package test.collectionoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class FindDivisibleNumbers {
	int cpp = 0;

	static void divisibleNumberFromArray1(int []a1, int []a2) {
		int j = 0; 
		
		while(j < a2.length) {
			ArrayList<Integer> divList = new ArrayList<>();
			ArrayList<Integer> arr1List = new ArrayList<Integer>();
			for (int i : a1) {
				arr1List.add(i);
			}

			for (int i = 0; i < a1.length; i++) {
				if((a2[j] % a1[i]) == 0) {
					divList.add(a1[i]);
				}
			}
			System.out.println(arr1List);
			if (divList.equals(arr1List)){
				System.out.println(a2[j] + " is divisible by ALL numbers");
			}
			/*if (!divList.isEmpty())
				System.out.println(a2[j] + " is divisible by " +divList);
			else
				System.out.println(a2[j] + " is not divisible by any number in input array");*/
			j++;
		};

	}
	
	void divisibleByAllNumberFromArray1(int []a1, int []a2) {
		
		int j = 0; 
		boolean flag = true;
		while(j < a2.length) {
			
			for (int i = 0; i < a2.length; i++) {
				for (int k = 0; k < a1.length; k++) {
					if((a2[i] % a1[k]) != 0) {
						flag = false;
						break;
					}
					else {
						flag = true;
					}
				}
				if (flag == true)
					System.out.println(a2[j] + " is divisible by all numbers");
				else
					System.out.println(a2[j] + " is NOT divisible by all numbers");
				j++;
			}
			
			
		
		};
	}
	
	void divisibleByNoNumberFromArray1(int []a1, int []a2) {
		
		int j = 0; 
		boolean flag = true;
		while(j < a2.length) {
			
			for (int i = 0; i < a2.length; i++) {
				for (int k = 0; k < a1.length; k++) {
					if((a2[i] % a1[k]) == 0) {
						flag = false;
						break;
					}
					else {
						flag = true;
					}
				}
				if (flag == true)
					System.out.println(a2[j] + " is NOT divisible by any numbers");
				j++;
			}
			
			
		
		};
	}
	
	public static void main(String[] args) {

		int[] arr1 = {2,3,5};
		int[] arr2 = {10, 15, 7, 60, 9, 4, 30};
		
		//new FindDivisibleNumbers().divisibleNumberFromArray1(arr1, arr2);
		new FindDivisibleNumbers().divisibleByAllNumberFromArray1(arr1, arr2);
		//new FindDivisibleNumbers().divisibleByNoNumberFromArray1(arr1, arr2);
	}

}
