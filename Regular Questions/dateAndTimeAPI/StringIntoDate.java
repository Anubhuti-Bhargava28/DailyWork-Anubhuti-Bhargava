package com.cts.task.dateAndTimeAPI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringIntoDate {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd yyyy");
			String date = today.format(formatter);
			System.out.printf("The Date is", today, date);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
