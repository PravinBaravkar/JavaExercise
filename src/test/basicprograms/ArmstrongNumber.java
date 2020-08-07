package test.basicprograms;

public class ArmstrongNumber { 
	
//Sum of cube of each digit is equal to the number, then its Armstrong number
	
		public static void main(String []args) {
			
			int num = 153, n, sum = 0;
			int temp = num;
			
			while (num > 0) {
				n = num % 10;
				sum = sum + (n * n * n);
				num = num / 10;
			}
			
		System.out.println("Sum of cube of each digit is " + sum);
		
		if (sum == temp)
			System.out.println(temp + " is Armstrong number");
		else
			System.out.println(temp + " is not Armstrong number");
	}
}
