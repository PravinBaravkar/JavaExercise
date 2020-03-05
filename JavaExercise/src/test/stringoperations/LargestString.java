package test.stringoperations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LargestString {

	void displayResult(String []names) {
		
		String largestStr = names[0];
		String shortestStr = names[0];
		
		for (String name : names) {
			
			if (name.length() > largestStr.length()) {
				largestStr = name;
			}
			else if (name.length() < shortestStr.length()) {
				shortestStr = name;
			}
		}
		
		System.out.println(largestStr + " is the largest string and length is :" + largestStr.length());
		System.out.println(shortestStr + " is the largest string and length is :" + shortestStr.length());
	}
	
	void displayResultListWithMap(String []names) {
		
		HashMap<String, Integer> nameList = new HashMap<>();
		
		int minLength = names[0].length();
		int maxLength = names[0].length();
		
		for (String name : names) {
			nameList.put(name, name.length());
			if (name.length() <= minLength) {
				minLength = name.length();
			}
			if (name.length() >= maxLength) {
				maxLength = name.length();
			}
		}
		
		System.out.println("Shortest Strings from array : ");
		
		for (Map.Entry<String, Integer> record : nameList.entrySet()) {
			
			if (record.getValue() == minLength) {
				System.out.println(record.getKey());
			}
			
		}

		System.out.println("Largest Strings from array : ");
		
		for (Map.Entry<String, Integer> record : nameList.entrySet()) {
			
			
			if (record.getValue() == maxLength) {
				System.out.println(record.getKey());
			}
		}

	}
	
	void displayResultList(String []names) {
		
		ArrayList<String> largestNameList = new ArrayList<>();
		ArrayList<String> shortestNameList = new ArrayList<>();
		
		int minLength = names[0].length();
		int maxLength = names[0].length();
		
		for (String name : names) {
			if (name.length() <= minLength) {
				minLength = name.length();
			}
			if (name.length() >= maxLength) {
				maxLength = name.length();
			}
		}
			
	for (String name : names) {
		
		if (name.length() == minLength) {
			shortestNameList.add(name);
		}
		
		else if (name.length() == maxLength) {
			largestNameList.add(name);
		}
	}

	System.out.println("Shortest Strings from array : " + shortestNameList);

	System.out.println("Largest Strings from array : " + largestNameList);

}
	
	public static void main(String[] args) {

			String []names = {"Prav", "Praviniti", "Praniti", "Spruha", "Shree", "Isha", "Shri", "Pravinita"};
			new LargestString().displayResult(names);
			new LargestString().displayResultListWithMap(names);
			new LargestString().displayResultList(names);
			
	}

}
