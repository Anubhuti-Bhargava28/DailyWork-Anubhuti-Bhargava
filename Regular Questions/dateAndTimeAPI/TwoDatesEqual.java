package com.cts.task.dateAndTimeAPI;

import java.time.LocalDate;

public class TwoDatesEqual {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1998, 01, 30);
		if (today.equals(birthday)) {
			System.out.println("Similar Date");

		} else {
			System.out.println("Not equal");
		}
	}

}
