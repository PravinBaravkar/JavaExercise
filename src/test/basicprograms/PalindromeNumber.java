package test.basicprograms;

public class PalindromeNumber {

	public static void main(String[] args) {

		int n = 1210121, num, reverse = 0;
		int temp = n;
		
		while (n > 0) {
			num = n % 10;
			reverse = (reverse * 10) + num;
			n = n / 10;
		}
		
		System.out.println("Reverse number is " + reverse);
		if (temp == reverse)
			System.out.println("Number is plaindrome");
		else
			System.out.println("Number is not palindrome");
	}

}
