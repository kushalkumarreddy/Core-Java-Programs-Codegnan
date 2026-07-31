package Packages.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	 public static void main(String[] args) {

	        String name = "Kushal";
	        Date joiningDate = new Date();

	        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");

	        System.out.println("Employee Name : " + name);
	        System.out.println("Joining Date  : " + sdf.format(joiningDate));
	    }

}
