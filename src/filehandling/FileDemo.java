package filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
		File file = new File("std.txt");
		
		try {
			if(file.createNewFile()) {
				System.out.println("created file sucessfully");
			} else {
				System.out.println("already exist");
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(file.getAbsolutePath());
		
	}

}
