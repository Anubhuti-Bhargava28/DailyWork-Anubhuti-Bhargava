package com.cts.task.dateAndTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class DaysAndMonthsBtwnDate {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(2028, 01, 28);

		Period months = Period.between(today, birthday);
		System.out.println(months.getYears() + " Years  " + months.getMonths() + " Months " + months.getDays()
				+ " Days in between the dates");

	}

}
