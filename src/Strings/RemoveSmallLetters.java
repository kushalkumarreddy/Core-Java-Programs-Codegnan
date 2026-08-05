package Strings;

public class RemoveSmallLetters {
	public static void main(String[] args) {
		
		String s = "jAvA DeVeloPer";
		String r = "";
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if (!Character.isLowerCase(ch)) {
				r = r + ch;
			}
		}
		
		System.out.println(r);
	}

}
