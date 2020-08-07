package test.sortingprograms;

public class BubbleSort {

	public void bubbleSortArray(int[] arr) {
		
		int length, temp;
		
		length = arr.length;
		
		for (int i = 0; i < length; i++) {
			for (int j = 1; j < (length - i); j++) {
				if (arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}	
		
	}
	
	public static void main (String args[]) {
		
		int arr[] = {5523,35,654,6654,563};
		
		BubbleSort obj = new BubbleSort();
		obj.bubbleSortArray(arr);
		
		for (int element : arr)
			System.out.print(element + " ");
	}
	
}