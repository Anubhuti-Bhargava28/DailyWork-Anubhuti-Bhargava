package com.cts.task.dateAndTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;

public class CurrentDateMonthYear {

	public static void main(String[] args) {

		LocalDate local = LocalDate.now();
		int month = local.getMonthValue();
		int day = local.getDayOfMonth();
		int year = local.getYear();

		System.out.println("Date: "+day+" Month: "+month+" Year: "+year);
	}

}
