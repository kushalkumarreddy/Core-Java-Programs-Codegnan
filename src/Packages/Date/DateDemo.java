package Packages.Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		
		Date d = new Date();
		DateFormat df = DateFormat.getDateInstance();
		
		SimpleDateFormat sdf = new SimpleDateFormat("MMM/dd/yyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/M/yyyy hh:mm:ss a");

		System.out.println(d);
		System.out.println(df.format(d));
		
		System.out.println(sdf.format(d));
		System.out.println(sdf1.format(d));

		
		
	}

}
