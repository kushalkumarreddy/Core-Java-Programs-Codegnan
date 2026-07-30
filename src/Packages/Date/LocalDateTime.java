package Packages.Date;

import java.time.LocalDate;

public class LocalDateTime {
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		System.out.println(today.getYear());
		System.out.println(today.getMonth());
		System.out.println(today.getMonthValue());
		System.out.println(today.getDayOfWeek());
	}

}
