package com.cts.task.dateAndTimeAPI;

import java.time.LocalTime;

public class AddHoursInTime {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		LocalTime newTime = time.plusHours(3);
		System.out.println("Current time is: " + time);
		System.out.println("Time after adding hours: " + newTime);
	}

}
