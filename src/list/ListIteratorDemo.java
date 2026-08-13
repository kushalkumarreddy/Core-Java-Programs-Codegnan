package list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();

        al.add("teja");
        al.add("sarayu");
        al.add("arjun");
        al.add("bharath");
        al.add("unknown");
        al.add("nikhil");
        al.add("krish");

        System.out.println(al);
        
        ListIterator<String> it = al.listIterator();
        while(it.hasPrevious()) {
        	System.out.println(it.hasPrevious());
        	}
        }
	}

}
