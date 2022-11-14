package com.bridgelabz;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservationSystem {

	ArrayList<Hotel> hotelList = new ArrayList<>();
	Hotel hotel;

	public void addHotel(String hotelName, double weekdayRateRegular) {
		hotel = new Hotel(hotelName, weekdayRateRegular);
		hotelList.add(hotel);
//		return hotel;
	}

	public void findcheapestHotel() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Start Date : ");
		String startdate = sc.nextLine();

		System.out.println("Enter End Date : ");
		String enddate = sc.nextLine();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		LocalDate startDate = LocalDate.parse(startdate, formatter);
		LocalDate endDate = LocalDate.parse(enddate, formatter);

		final long days = ChronoUnit.DAYS.between(startDate, endDate);

		String hotelName = " ";
		double min = 0;
		for (Hotel hotel : hotelList) {

			double totalRate = (double) days * hotel.getWeekdayRegularCustomerCost();
			if (min == 0 || totalRate < min) {

				min = totalRate;
				hotelName = hotel.getHotelName();
			}
		}
		System.out.print(hotelName + " , Total Rate : " + min);
	}

}
