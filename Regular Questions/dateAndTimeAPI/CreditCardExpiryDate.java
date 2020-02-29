package com.cts.task.dateAndTimeAPI;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;

public class CreditCardExpiryDate {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		int year= today.getYear();
		int month =today.getMonthValue();
		System.out.println("Todays's Year: "+year+" Month: "+month);
		
		YearMonth exp=YearMonth.of(2029, Month.DECEMBER);
		System.out.println("Your Credit Card Expiry :"+exp);
		
		}

}
