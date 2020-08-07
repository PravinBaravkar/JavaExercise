package test.stringoperations;

public class StringReverse {

	public static void main(String[] args) {

		char[] str = {'t','h','i','s'};
		int[] arr = {10,39,67,893};
		
		
		for(int i = str.length-1; i>= 0; i --) {
			System.out.print(str[i]);
		}
		
		System.out.println();
		
		for(int i = arr.length-1; i>= 0; i --) {
			System.out.print(arr[i] + ",");
		}

		
	}

}
