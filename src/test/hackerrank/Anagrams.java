package test.hackerrank;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
      
    	TreeMap<Character, Integer> mapA = convertToHashMapAndSort(a);
    	TreeMap<Character, Integer> mapB = convertToHashMapAndSort(b);
    	
    	   	
       return mapA.equals(mapB);
        
    }
    
    static TreeMap<Character, Integer> convertToHashMapAndSort(String str) {
    	HashMap<Character, Integer> map = new HashMap<>();
    	 
        char[] arr1 = str.toCharArray();
        
        for (char ch : arr1) {
      	  if (map.containsKey(ch)) {
      		  map.put(Character.toLowerCase(ch), map.get(ch)+1);
          	  
      	  }
      	  else {
      		  map.put(Character.toLowerCase(ch), 1);
      	  }
      	  
        }

        TreeMap<Character, Integer> sortedMap = new TreeMap<>();
        sortedMap.putAll(map);
        
        return sortedMap;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
