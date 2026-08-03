package Strings;

public class StringMethods {
	public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Java";

        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);

        // Length
        System.out.println("Length: " + s1.length());

        // Concatenation
        System.out.println("Concatenation: " + s1.concat(" " + s2));

        // UpperCase
        System.out.println("Uppercase: " + s1.toUpperCase());

        // LowerCase
        System.out.println("Lowercase: " + s2.toLowerCase());

        // Character at index
        System.out.println("Character at index 1: " + s1.charAt(1));

        // Substring
        System.out.println("Substring: " + s1.substring(1, 4));

        // Equals
        System.out.println("Equals: " + s1.equals("Hello"));

        // == Operator
        String s3 = "Hello";
        String s4 = new String("Hello");

        System.out.println("s1 == s3 : " + (s1 == s3));
        System.out.println("s1 == s4 : " + (s1 == s4));
        System.out.println("s1.equals(s4) : " + s1.equals(s4));

        // Contains
        System.out.println("Contains 'ell': " + s1.contains("ell"));

        // Replace
        System.out.println("Replace: " + s1.replace('l', 'x'));
    }

}
