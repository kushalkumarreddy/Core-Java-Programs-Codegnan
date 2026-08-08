package PracticeSession;

public class EvenUpperCase {
	
	public static void main(String[] args) {
		
		String str = "This is a java program";		
		String[] words = str.split(" ");
		
		for(int i=0;i<words.length;i++) {
			if(i%2==0) {
				System.out.print(words[i].toUpperCase());
			} else {
				String reversed = new StringBuilder(words[i]).reverse().toString();
				System.out.print(reversed);
			}
			
			if (i != words.length -1) {
				System.out.print(" ");
			}
		}
		
	}

}
