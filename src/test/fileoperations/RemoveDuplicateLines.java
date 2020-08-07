package test.fileoperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashSet;

public class RemoveDuplicateLines {

public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("output.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("unique.txt"));
		String line ="";
		System.out.println("File content..:");
		while ((line = br.readLine()) !=null) {
			System.out.println(line);
			
		}
		System.out.println();
		
		br = new BufferedReader(new FileReader("output.txt"));
		LinkedHashSet<String> l1 = new LinkedHashSet<>();
		
		System.out.println("File content after removing duplicate Lines..:");
		while ((line = br.readLine()) !=null) {
			//System.out.println(line);
			l1.add(line);
			
		}
		
		for (String uniqueLine : l1) {
			System.out.println(uniqueLine);
			bw.write(uniqueLine+"\n");
			
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
