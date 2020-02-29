package com.cts.task.dateAndTimeAPI;

import java.time.LocalTime;

public class CurrentTime {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println("Current Time is: " + time);
	}

}
