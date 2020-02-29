package com.cts.task.dateAndTimeAPI;

import java.time.Clock;

public class ClockInJava {

	public static void main(String[] args) {

		Clock clk = Clock.systemUTC();
		System.out.println("Clock :" + clk);
		Clock defaultClock = Clock.systemDefaultZone();
		System.out.println("Clock :" + defaultClock);

	}

}
