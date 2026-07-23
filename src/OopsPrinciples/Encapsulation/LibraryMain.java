package OopsPrinciples.Encapsulation;

import java.util.Scanner;

public class LibraryMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library lib = new Library();

        lib.setBookID(sc.nextInt());
        lib.setOverdueDays(sc.nextInt());

        int days2 = sc.nextInt();
        sc.nextInt();
        int days3 = sc.nextInt();

        System.out.println(lib.fineByDays(days2));
        System.out.println(lib.fixedFine());
        System.out.println(lib.fineByDaysPlusFixed(days3));
        System.out.println(lib.getBookID());
        System.out.println(lib.getOverdueDays());

        sc.close();
    }
}