package test.basicprograms;

public class CheckPrime {

	
	public static void main (String []args) {
		
		int n = 17;
		boolean isPrime = true;
		
		if (n == 0 || n == 1)
			System.out.println(n + " is not prime number");
		
		int p = n/2;
		
		for (int i = 2; i <= p; i++) {
			
			if(n % i == 0) {
				System.out.println(n + " is not prime number");
				isPrime = false;
				break;
			}
		}
		
		if(isPrime == true)
			System.out.println(n + " is prime number");
	}
}
