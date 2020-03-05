package test.stringoperations;

public class StringCombinations {

	StringBuilder output = new StringBuilder();
	String inputString = "abcd";	
	public void combine() {
		combine(0);
	}

	private void combine(int start) {
		for (int i = start; i < inputString.length(); ++i) {
			output.append(inputString.charAt(i));
			System.out.println(output);
			if (i < inputString.length())
				combine(i + 1);
			output.setLength(output.length() - 1);
		}
	}

	public static void main(String[] args) {
		new StringCombinations().combine();
	}

}
