package PracticeSession;

public class ArrayOfEvenPosition {
	public static void main(String[] args) {
		
		String str = "Java is a Object Oriented Programming Language";
		String[] words = str.split(" ");
		String[] evenpos = new String[(words.length + 1)/2];
		
		int j = 0;
		for(int i=0;i<words.length;i+=2) {
			evenpos[j++] = words[i];
		}
		
		for(String word : evenpos) {
			System.out.print(word+" ");
		}
		
	}

}
