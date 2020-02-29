
package com.cts.task.dateAndTimeAPI;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZones {

	public static void main(String[] args) {
		ZoneId zoneId = ZoneId.of("Asia/Calcutta");

		LocalDateTime lDateTime = LocalDateTime.now();
		ZonedDateTime zDateTime = ZonedDateTime.of(lDateTime, zoneId);
		System.out.println("Date and Time in Pune :" + zDateTime);
	}

}
