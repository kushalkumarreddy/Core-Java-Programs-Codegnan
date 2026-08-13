package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<String> al = new ArrayList<>();

        al.add("teja");
        al.add("sarayu");
        al.add("arjun");
        al.add("bharath");

        System.out.println(al);

        System.out.println("Using normal for loop");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        System.out.println("Using enhanced for loop");
        for (String s : al) {
            System.out.println(s);
        }
        
        System.out.println("Using Iterator................");
        Iterator<String>  it = al.iterator();
        
        while(it.hasNext()) {
        	String name = it.next();        	
        	if(name.length()==4) {
        		it.remove();
        	}
        }
        System.out.println(al);
    }
}