package test.fileoperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = null;
		FileReader fi;
		
		String input = "This is my first program to read and write in file";
		try {
			fw= new FileWriter("output.txt");
						
			System.out.println("Writing in to file...");
			
			fw.write(input.toCharArray());
			fw.write('\n');
			
			
			for (int i = 0; i < input.length(); i++) {
				fw.write(input.charAt(i));
			}
			fw.write('\n');
			fw.write(input);
			
			fw.write("APPEND", 0, "APPEND".length());
						
			fw.flush();
			
			
			System.out.println("Job Well Done... Please check your file");
			
			System.out.println("Reading from file..");
			fi = new FileReader("output.txt");
			BufferedReader br = new BufferedReader(fi);
			
			int ch;
			
			while ((ch = fi.read()) != -1) {
				System.out.print((char)ch);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		BufferedWriter bw = new BufferedWriter(fw);
		bw.newLine();
		bw.write(input,0,input.length());
		bw.flush();
		fw.close();

	}

}
