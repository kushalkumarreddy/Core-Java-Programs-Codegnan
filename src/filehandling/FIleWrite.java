package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleWrite {
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("std.txt");
			String msg = "I'm entering into the file using output stream";
			fos.write(msg.getBytes()); //converts string into byte
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
