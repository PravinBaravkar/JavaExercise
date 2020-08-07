package test.hackerrank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class SampleTets {

	public void example1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String1:");
		String A = sc.next();
		System.out.println("Enter String2:");
		String B = sc.next();
		System.out.println(A.length() + B.length());
		sc.close();
		System.out.println((B.compareTo(A) > 0) ? "No" : "Yes");
		System.out.println(Character.toUpperCase(A.charAt(0)) + A.substring(1) + " "
				+ Character.toUpperCase(B.charAt(0)) + B.substring(1));

	}

	public static String getSmallestAndLargest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String s = sc.next();
		System.out.println("Enter number:");
		int k = Integer.parseInt(sc.next());

		String smallest = "";
		String largest = "";
		/*
		 * ArrayList<String> arr = new ArrayList<String>(); for(int
		 * i=0;i<s.length()-k+1;i++){ arr.add(s.substring(i,k+i)); }
		 * 
		 * Collections.sort(arr); smallest=arr.get(0); largest=arr.get(arr.size()-1);
		 */
		smallest = s.substring(0, k);
		largest = s.substring(0, k);
		for (int i = 0; i < s.length() - k + 1; i++) {
			largest = ((largest.compareTo(s.substring(i, i + k)) > 0) ? largest : s.substring(i, i + k));
			smallest = ((smallest.compareTo(s.substring(i, i + k)) < 0) ? smallest : s.substring(i, i + k));
		}

		System.out.println("Smallest substring is :" + smallest + " and largest substring is " + largest);
		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		return smallest + "\n" + largest;
	}

	public void palindrome() {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		String reverse = "";
		for (int i = A.length() - 1; i >= 0; i--) {
			reverse += A.charAt(i);
		}
		sc.close();

		System.out.println(A.equals(reverse) ? "Yes" : "No");
	}

	public static void stringTokens() {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String str = s.trim();

		if (str.length() > 0) {
			String[] tokens = str.split("[ !,?._'@]+"); // [^a-zA-Z]+
			System.out.println(tokens.length);
			for (String token : tokens)
				System.out.println(token);
		} else {
			System.out.println(0);
		}
		scan.close();
	}

	public static void main(String[] args) {
		// getSmallestAndLargest();
		stringTokens();

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String pattern = in.nextLine();
			// Write your code
			try {
				Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (PatternSyntaxException e) {
				System.out.println("Invalid");
			}
			
			testCases--;
			
		}
	}
}