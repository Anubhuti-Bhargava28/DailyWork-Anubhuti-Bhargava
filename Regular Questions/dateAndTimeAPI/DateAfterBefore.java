package com.cts.task.dateAndTimeAPI;

import java.time.LocalDate;

public class DateAfterBefore {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1998, 01, 28);

		if (today.isBefore(birthday)) {
			System.out.println("Date is After today's date");
		} else {
			System.out.println("Date is beofre today's date");
		}
	}

}
