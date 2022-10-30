package com.example.persistence.domain;//booking=musician, there can be many bookings for a car

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uniquebookingnumber;
    private Integer bookingdate;
    private Float bookingtime;
    private Boolean vehicletype;
    private Integer numberofdays;
    private Integer bookingdateout;
    private Float bookingtimeout;
    private Integer bookingdatereturn;
    private Float bookingtimereturn;
    private Integer carnumber;
    private Integer dispatcherID;
    private Boolean bookingdispatched;
    private Boolean bookingstatus;
    @ManyToOne
    private Car car;
	public Long getUniquebookingnumber() {
		return uniquebookingnumber;
	}
	public void setUniquebookingnumber(Long uniquebookingnumber) {
		this.uniquebookingnumber = uniquebookingnumber;
	}
	public Integer getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(Integer bookingdate) {
		this.bookingdate = bookingdate;
	}
	public Float getBookingtime() {
		return bookingtime;
	}
	public void setBookingtime(Float bookingtime) {
		this.bookingtime = bookingtime;
	}
	public Boolean getVehicletype() {
		return vehicletype;
	}
	public void setVehicletype(Boolean vehicletype) {
		this.vehicletype = vehicletype;
	}
	public Integer getNumberofdays() {
		return numberofdays;
	}
	public void setNumberofdays(Integer numberofdays) {
		this.numberofdays = numberofdays;
	}
	public Integer getBookingdateout() {
		return bookingdateout;
	}
	public void setBookingdateout(Integer bookingdateout) {
		this.bookingdateout = bookingdateout;
	}
	public Float getBookingtimeout() {
		return bookingtimeout;
	}
	public void setBookingtimeout(Float bookingtimeout) {
		this.bookingtimeout = bookingtimeout;
	}
	public Integer getBookingdatereturn() {
		return bookingdatereturn;
	}
	public void setBookingdatereturn(Integer bookingdatereturn) {
		this.bookingdatereturn = bookingdatereturn;
	}
	public Float getBookingtimereturn() {
		return bookingtimereturn;
	}
	public void setBookingtimereturn(Float bookingtimereturn) {
		this.bookingtimereturn = bookingtimereturn;
	}
	public Integer getCarnumber() {
		return carnumber;
	}
	public void setCarnumber(Integer carnumber) {
		this.carnumber = carnumber;
	}
	public Integer getDispatcherID() {
		return dispatcherID;
	}
	public void setDispatcherID(Integer dispatcherID) {
		this.dispatcherID = dispatcherID;
	}
	public Boolean getBookingdispatched() {
		return bookingdispatched;
	}
	public void setBookingdispatched(Boolean bookingdispatched) {
		this.bookingdispatched = bookingdispatched;
	}
	public Boolean getBookingstatus() {
		return bookingstatus;
	}
	public void setBookingstatus(Boolean bookingstatus) {
		this.bookingstatus = bookingstatus;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Booking(Long uniquebookingnumber, Integer bookingdate, Float bookingtime, Boolean vehicletype,
			Integer numberofdays, Integer bookingdateout, Float bookingtimeout, Integer bookingdatereturn,
			Float bookingtimereturn, Integer carnumber, Integer dispatcherID, Boolean bookingdispatched,
			Boolean bookingstatus, Car car) {
		super();
		this.uniquebookingnumber = uniquebookingnumber;
		this.bookingdate = bookingdate;
		this.bookingtime = bookingtime;
		this.vehicletype = vehicletype;
		this.numberofdays = numberofdays;
		this.bookingdateout = bookingdateout;
		this.bookingtimeout = bookingtimeout;
		this.bookingdatereturn = bookingdatereturn;
		this.bookingtimereturn = bookingtimereturn;
		this.carnumber = carnumber;
		this.dispatcherID = dispatcherID;
		this.bookingdispatched = bookingdispatched;
		this.bookingstatus = bookingstatus;
		this.car = car;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Booking [uniquebookingnumber=" + uniquebookingnumber + ", bookingdate=" + bookingdate + ", bookingtime="
				+ bookingtime + ", vehicletype=" + vehicletype + ", numberofdays=" + numberofdays + ", bookingdateout="
				+ bookingdateout + ", bookingtimeout=" + bookingtimeout + ", bookingdatereturn=" + bookingdatereturn
				+ ", bookingtimereturn=" + bookingtimereturn + ", carnumber=" + carnumber + ", dispatcherID="
				+ dispatcherID + ", bookingdispatched=" + bookingdispatched + ", bookingstatus=" + bookingstatus
				+ ", car=" + car + "]";
	}
	
    
    
}