package test.stringoperations;

public class CapitalizeEachWordInString {

	void capitalizeWord(String str) {
		
		String words[] = str.split(" ");
		for(String st : words) {
			String first = st.substring(0,1);
			first = first.toUpperCase();
			st = first + st.substring(1);
			
			System.out.print(st + " ");
		}
	}
	
		public static void main(String args[]) {
			
			String s = "my name Is khan";
			
			char[] ch = s.toCharArray();
			for (int i = ch.length-1; i>= 0; i--)
				System.out.print(ch[i]);
			System.out.println();
			new CapitalizeEachWordInString().capitalizeWord(s);
		}
}
