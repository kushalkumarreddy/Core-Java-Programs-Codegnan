package map;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
	public static void main(String[] args) {
		String s = "hello world hello java world";
		String[] words = s.split(" ");
		
		Map<String, Integer> wc = new HashMap<>();
		
		for(String word: words) {
			if(wc.containsKey(word)) {
				wc.put(word, wc.get(word)+1);
			} else {
				wc.put(word, 1);
			}
		}
		
		for (String word : wc.keySet()) {
            System.out.println(word + " = " + wc.get(word));
        }
	}

}
