package test.stringoperations;

public class ReverseEachWordInString {

	void reverseEachWord(String s) {
		
		String[] words = s.split(" ");
		
		for (int i = words.length-1; i >= 0; i-- ) {
			//System.out.print(words[i] + " ");
		}
		for (String word : words) {
			
			//StringBuffer sb = new StringBuffer(word);
			//System.out.print(sb.reverse() + " ");
			
			char[] first = word.toCharArray();
			for (int i = word.length()-1; i >= 0; i-- ) {
				System.out.print(first[i]);
			}
			System.out.print(" ");
		}
	}
	public static void main(String[] args) {

			String str = "this is javatpoint";
			new ReverseEachWordInString().reverseEachWord(str);

	}

}
