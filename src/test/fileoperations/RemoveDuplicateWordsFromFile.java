package test.fileoperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateWordsFromFile {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("output.txt"));
		String line ="";
		System.out.println("File content..:");
		while ((line = br.readLine()) !=null) {
			System.out.println(line);
			
		}
		System.out.println();
		
		br = new BufferedReader(new FileReader("output.txt"));
		LinkedHashSet<String> l1;;
		
		System.out.println("File content after removing duplicate words..:");
		while ((line = br.readLine()) !=null) {
			l1 = new LinkedHashSet<>();
			//System.out.println(line);
			String[] arr = line.split(" ");
			for (String w : arr)
				l1.add(w);
			
			for (String word : l1) {
				System.out.print(word + " ");
			}
			System.out.println();
		}
		br.close();
	}
}
