package com.cts.task.dateAndTimeAPI;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DayAfterWeek {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalDate next = date.plus(1, ChronoUnit.WEEKS);
		System.out.println("Today's date: " + date);
		System.out.println("Afetr One Week" + next);
	}

}
