package Exceptions;

import java.util.ArrayList;

public class MemoryError {
	public static void main(String[] args) {
		
		ArrayList<int[]> list = new ArrayList<>();

        while (true) {
            list.add(new int[1000000]); // Allocate large arrays continuously
        }
		
	}

}