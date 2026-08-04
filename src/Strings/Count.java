package Strings;

public class Count {
	public static void main(String[] args) {

		String s = "javajavaJ";
		s = s.toLowerCase();
		int count = 0;
		int vowelCount = 0;
		
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);

			// Count 'j'
			if (ch == 'j') {
				count++;
			}

			// Count vowels
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			}
		}

		System.out.println("Count of j = " + count);
		System.out.println("Count of vowels = " + vowelCount);
	}

}
