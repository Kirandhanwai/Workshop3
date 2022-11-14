package com.bridgelabz;

import java.util.ArrayList;

public class HotelReservationSystem {

	ArrayList<Hotel> hotelList = new ArrayList<>();
	Hotel hotel;

	public void addHotel(String hotelName, double weekdayRateRegular) {
		hotel = new Hotel(hotelName, weekdayRateRegular);
		hotelList.add(hotel);
//		return hotel;
	}

}
