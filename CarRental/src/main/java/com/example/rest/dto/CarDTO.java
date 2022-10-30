package com.example.rest.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.persistence.domain.Booking;

public class CarDTO {
		
	    private Integer CarNumber;
		private Integer CarDatePurchased;
		private Integer CarMake; 
		private Integer CarYear;
		private String Model;
		private String CarLocation;
		private Boolean CarStatus;
		private String CarRegistrationNumber;   
	    private List<Booking> Bookings = new ArrayList<>();
		public Integer getCarNumber() {
			return CarNumber;
		}
		public void setCarNumber(Integer carNumber) {
			CarNumber = carNumber;
		}
		public Integer getCarDatePurchased() {
			return CarDatePurchased;
		}
		public void setCarDatePurchased(Integer carDatePurchased) {
			CarDatePurchased = carDatePurchased;
		}
		public Integer getCarMake() {
			return CarMake;
		}
		public void setCarMake(Integer carMake) {
			CarMake = carMake;
		}
		public Integer getCarYear() {
			return CarYear;
		}
		public void setCarYear(Integer carYear) {
			CarYear = carYear;
		}
		public String getModel() {
			return Model;
		}
		public void setModel(String model) {
			Model = model;
		}
		public String getCarLocation() {
			return CarLocation;
		}
		public void setCarLocation(String carLocation) {
			CarLocation = carLocation;
		}
		public Boolean getCarStatus() {
			return CarStatus;
		}
		public void setCarStatus(Boolean carStatus) {
			CarStatus = carStatus;
		}
		public String getCarRegistrationNumber() {
			return CarRegistrationNumber;
		}
		public void setCarRegistrationNumber(String carRegistrationNumber) {
			CarRegistrationNumber = carRegistrationNumber;
		}
		public List<Booking> getBookings() {
			return Bookings;
		}
		public void setBookings(List<Booking> bookings) {
			Bookings = bookings;
		}
		public CarDTO(Integer carNumber, Integer carDatePurchased, Integer carMake, Integer carYear, String model,
				String carLocation, Boolean carStatus, String carRegistrationNumber, List<Booking> bookings) {
			super();
			CarNumber = carNumber;
			CarDatePurchased = carDatePurchased;
			CarMake = carMake;
			CarYear = carYear;
			Model = model;
			CarLocation = carLocation;
			CarStatus = carStatus;
			CarRegistrationNumber = carRegistrationNumber;
			Bookings = bookings;
		}
		public CarDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "CarDTOTemp [CarNumber=" + CarNumber + ", CarDatePurchased=" + CarDatePurchased + ", CarMake="
					+ CarMake + ", CarYear=" + CarYear + ", Model=" + Model + ", CarLocation=" + CarLocation
					+ ", CarStatus=" + CarStatus + ", CarRegistrationNumber=" + CarRegistrationNumber + ", Bookings="
					+ Bookings + "]";
		}
	
	    
	    
	    
}
