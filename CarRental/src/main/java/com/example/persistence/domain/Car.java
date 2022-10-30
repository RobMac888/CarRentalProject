package com.example.persistence.domain;

import java.util.ArrayList;
import javax.persistence.Id;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer CarNumber;
	private Integer CarDatePurchased;
	private Integer CarMake; 
	private Integer CarYear;
	private String Model;
	private String CarLocation;
	private Boolean CarStatus;
	private String CarRegistrationNumber;
	
	@OneToMany(mappedBy = "car", fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Booking> bookings = new ArrayList<>();

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
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public Car(Integer carNumber, Integer carDatePurchased, Integer carMake, Integer carYear, String model,
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
		this.bookings = bookings;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Car [CarNumber=" + CarNumber + ", CarDatePurchased=" + CarDatePurchased + ", CarMake=" + CarMake
				+ ", CarYear=" + CarYear + ", Model=" + Model + ", CarLocation=" + CarLocation + ", CarStatus="
				+ CarStatus + ", CarRegistrationNumber=" + CarRegistrationNumber + ", bookings=" + bookings + "]";
	}

	
	
}