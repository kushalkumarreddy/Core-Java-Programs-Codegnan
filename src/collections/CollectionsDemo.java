package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();

        al.add("teja");
        al.add("sarayu");
        al.add("arjun");
        al.add("bharath");

        System.out.println(al);

        Collections.sort(al);
        System.out.println(al);

        Collections.reverse(al);
        System.out.println(al);
    }
}