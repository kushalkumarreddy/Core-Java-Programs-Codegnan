package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("std.txt");
			int data;
			
			while((data = fis.read())!= -1) {
				System.out.print((char)data);
			}
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}