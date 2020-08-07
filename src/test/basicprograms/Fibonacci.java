package test.basicprograms;

public class Fibonacci {
	
	static int n1 = 0, n2 = 1, n3;
	
	public void printFiboManually (int number) {
		
		for (int i = 2;i<number;i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
			
		}
		
	}
	
	public void printFiboRecursion (int number) {
		
		if(number > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			printFiboRecursion(number - 1);
		}
		
	}

	public static void main(String[] args) {
		
		Fibonacci fibo = new Fibonacci();
		int num = 10;
		System.out.print(n1 + " " + n2);
		fibo.printFiboManually(num);
		//fibo.printFiboRecursion(num - 2);


	}

}
