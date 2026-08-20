package map;

import java.util.HashMap;
import java.util.Map;

public class KeyCount {
	public static void main(String[] args) {
		String s = "kushal";
		Map<Character, Integer> hmap = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(hmap.containsKey(ch)) {
				hmap.put(ch, hmap.get(ch)+1);
			} else {
				hmap.put(ch,  1);
			}
		}
		System.out.println(hmap);
	}

}