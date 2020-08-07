package test.stringoperations;

public class StringtOGGLE {

	void tOGGLE(String st) {
		
		String[] words = st.split(" ");
		
		for(String word : words) {
			String first = word.substring(0,1);
			String second = word.substring(1);
			second = second.toUpperCase();
			word = first.toLowerCase().concat(second);
			
			System.out.print(word + " ");
		}
	}
	
void reversetOGGLE(String st) {
		
		String[] words = st.split(" ");
		
		for(String word : words) {
			StringBuffer sb = new StringBuffer(word);
			sb.reverse();
			String first = sb.substring(0,1);
			String second = sb.substring(1);
			second = second.toUpperCase();
			word = first.toLowerCase().concat(second);
			
			System.out.print(word + " ");
		}
	}

	public static void main(String[] args) {

		String str = "this is javatpoint";
		new StringtOGGLE().tOGGLE(str);
		System.out.println();
		new StringtOGGLE().reversetOGGLE(str);

	}

}
