package com.bridgelabz;

public class HotelReservation {
	public static void main(String[] args) {
		HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
		System.out.println("Hotel Reservation System");
		hotelReservationSystem.addHotel("lakewood", 110);
		hotelReservationSystem.addHotel("Brigwood", 160);
		hotelReservationSystem.addHotel("Ridgewood", 220);

		for (Hotel List : hotelReservationSystem.hotelList) {
			System.out.println(List);
		}
//		23-05-2022  to 31-05-2022
		hotelReservationSystem.findcheapestHotel();
	}
}
