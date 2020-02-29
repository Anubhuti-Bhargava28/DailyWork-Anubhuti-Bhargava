package com.cts.task.dateAndTimeAPI;

import java.time.LocalDate;

public class TodaysDate {

	public static void main(String[] args) {
		LocalDate local =  LocalDate.now();
		System.out.println("Todays's Date is: "+local);
	}

}
