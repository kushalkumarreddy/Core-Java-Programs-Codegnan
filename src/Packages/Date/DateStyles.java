package Packages.Date;

import java.text.DateFormat;
import java.util.Date;

public class DateStyles {
    public static void main(String[] args) {

        Date d = new Date();

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat df2= DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.MEDIUM);

        System.out.println(df.format(d));
        System.out.println(df1.format(d));
        System.out.println(df2.format(d));
        System.out.println(df3.format(d));
    }
}