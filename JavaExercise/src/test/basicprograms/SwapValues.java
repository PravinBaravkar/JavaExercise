package test.basicprograms;

public class SwapValues {
	
	public static void main(String[] args) {
		
		int a = 10, b = 30;
		int temp;
		
		System.out.println("A is : " + a + " B is : " + b);
		
		//temp = a;
		//a = b;
		//b = temp;
		
		
		//Without third variable
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("A is : " + a + " B is : " + b);
		  
	}
}
