package com.cts.regularWork.dateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {

		Date date = new Date(0);
		System.out.println(date);

		int day = date.getDay();
		switch (day) {
		case 0:
			System.out.println("Sunday");

			break;
		case 1:
			System.out.println("Monday");

			break;
		case 2:
			System.out.println("Tuesday");

			break;
		case 3:
			System.out.println("Wednesday");

			break;
		case 4:
			System.out.println("Thursday");

			break;
		case 5:
			System.out.println("Friday");

			break;
		case 6:
			System.out.println("Saturday");

			break;

		default:
			break;
		}
		
		LocalDate local =  LocalDate.now();
		System.out.println(local);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println( dateTime);
		
	}

}
