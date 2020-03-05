package test.basicprograms;

public class ReverseNumber {

	public static void main(String[] args) {

		int num = 1356, temp, reverse = 0;
		
		while (num > 0) {
			
			temp = num % 10;
			reverse = (reverse * 10) + temp;
			num = num / 10;
		}
		
		System.out.println("Reverse number is " + reverse);
	}

}
