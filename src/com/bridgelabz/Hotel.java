package com.bridgelabz;

public class Hotel {
	private String hotelName;
	private double weekdayRegularCustomerCost;

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public double getWeekdayRegularCustomerCost() {
		return weekdayRegularCustomerCost;
	}

	public void setWeekdayRegularCustomerCost(double weekdayRegularCustomerCost) {
		this.weekdayRegularCustomerCost = weekdayRegularCustomerCost;
	}

	public Hotel(String hotelName, double weekdayRegularCustomerCost) {
		super();
		this.hotelName = hotelName;
		this.weekdayRegularCustomerCost = weekdayRegularCustomerCost;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", weekdayRegularCustomerCost=" + weekdayRegularCustomerCost + "]";
	}

}
