package com.cts.task.dateAndTimeAPI;

import java.time.LocalDate;
import java.time.MonthDay;

public class RecurringEvents {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1998, 01, 28);
		MonthDay birth = MonthDay.of(birthday.getMonthValue(), birthday.getDayOfMonth());
		MonthDay current = MonthDay.from(today);
		if (birth.equals(current)) {
			System.out.printf("Today " + today + "and birthday" + birthday + "are same dates ");
		} else {
			System.out.println("Dates are not Equal");
		}
	}

}
