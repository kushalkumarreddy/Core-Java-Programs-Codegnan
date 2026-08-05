package Strings;

public class RemoveCapitals {
	public static void main(String[] args) {
		
		String s = "jAvA DeVeloPer";
		String r = "";
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if (!Character.isUpperCase(ch)) {
				r = r + ch;
			}
		}
		
		System.out.println(r);
	}

}
