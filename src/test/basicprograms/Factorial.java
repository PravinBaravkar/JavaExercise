package test.basicprograms;

public class Factorial {

	int fact = 1;
	public int printFactorialManually(int number) {
	
		for(int i=1;i<=number;i++) {
			fact = fact * i;
		}
		
		return fact;
	}
	
	public int printFactorialRecursion(int number) {
		if (number == 1)    
		    return 1;    
		 else    
			return ( number * printFactorialRecursion(number - 1));
			
	}
	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		int num = 6;
		//System.out.println(f.printFactorialManually(num));
		System.out.println(factorial.printFactorialRecursion(num));

	}

}
