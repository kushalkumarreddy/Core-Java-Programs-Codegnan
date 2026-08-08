package PracticeSession;

public class PrintExtension {
	public static void main(String[] args) {
		String file = "Passport.jpeg";
		int index = file.indexOf(".");
		
		System.out.println(file.substring(index));
	}

}
