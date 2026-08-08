package PracticeSession;

public class SameOrNot {
	public static void main(String[] args) {
		
		String s1 = "New York";
		String s2 = "NWYR";
		
		s1 = s1.toUpperCase();
		s2 = s2.toUpperCase();
		
		for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (ch == ' ')
                continue;

            if (s2.indexOf(ch) != -1) {
                System.out.print(ch + "+");
            }
        }		
	}

}
