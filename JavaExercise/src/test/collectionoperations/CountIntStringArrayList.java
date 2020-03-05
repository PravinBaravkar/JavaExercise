package test.collectionoperations;

import java.util.ArrayList;
import java.util.Arrays;

public class CountIntStringArrayList {

	public static void main(String[] args) {
		
		String []str = {"India","US","China","India"};
		int strCount = 0, intCnt = 0;
		
		ArrayList list = new ArrayList<>(Arrays.asList(str));
		list.add(13);
		list.add(3445);
		
		System.out.println(list.size());
		
		for (Object elem : list) {
			System.out.print(elem + " ");
		}
		
		for (Object obj : list) {
			if (obj instanceof String) {
				strCount++;
			}
			else
				intCnt++;
		}
		
		System.out.println("String count : " + strCount + "\nInteger Count : " + intCnt);
	}
}
