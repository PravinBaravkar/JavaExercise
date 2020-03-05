package test.stringoperations;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class CharacterCountInString {

	public static void main(String[] args) {
		String str = "pravin kisAn baravkar";
		char[] charArr = str.toCharArray();
		HashMap<Character, Integer> chMap = new HashMap<>();

		for (char ch : charArr) {
			if (ch == ' ' || ch == '\n') {
				
			} //else if (!chMap.containsKey(Character.toUpperCase(ch))) {
			else if (!chMap.containsKey(ch)) {	
				//chMap.put(Character.toUpperCase(ch), 1);
				chMap.put(ch, 1);
			} else {
				//chMap.put(Character.toUpperCase(ch), 1 + chMap.get(Character.toUpperCase(ch)));
				chMap.put(ch, chMap.get(ch)+1);
			}
		}
		for (Map.Entry<Character, Integer> entry : chMap.entrySet()) {
			System.out.println("Number of occurences of " + entry.getKey() + " is : " + entry.getValue());
		}

		System.out.println("Sorted order");
		SortedSet<Character> sorted = new TreeSet<>();
		sorted.addAll(chMap.keySet());
		
		System.out.println(sorted);
		
		Iterator<Character> iter = sorted.iterator();
		while (iter.hasNext()) {
			Character ch = iter.next();
			System.out.println("Number of occurences of " + ch + " is : " + chMap.get(ch));
		}
		
		StringBuilder str1 = new StringBuilder(str);
		System.out.println(str1.reverse());
		
		String []arr = str.split(" ");
		
		for (int i = 0; i < arr.length; i++) {
			String st = arr[i];
			String fs = st.substring(0, 1).toUpperCase().concat(st.substring(1).toLowerCase());
			System.out.print(fs+" ");
			
		}
		System.out.println();
		for(int i = arr.length-1; i >= 0; i --) {
			System.out.print(arr[i] + " ");
		}
	}
}
