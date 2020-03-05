package test.fileoperations;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;


public class CopyFile {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedInputStream input;
		BufferedOutputStream writer;
		
		
		System.out.println("Enter file name :");
		try {
			String fname = reader.readLine();
			System.out.println("Enter New file name :");
			String newName = reader.readLine();
			FileInputStream fis = new FileInputStream(fname);
			FileOutputStream fos = new FileOutputStream(newName);
			input = new BufferedInputStream(fis);
			writer = new BufferedOutputStream(fos);

			int i = 0;
			while ((i = input.read()) != -1) {
				writer.write((char) i);

			}
System.currentTimeMillis();
			writer.flush();

			FileInputStream fis1 = new FileInputStream(newName);
			SequenceInputStream sis = new SequenceInputStream(fis, fis1);

			int j = 0;

			while ((j = sis.read()) != -1) {
				System.out.print((char) j);
				;

			}

			sis.close();

			writer.close();
			input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
