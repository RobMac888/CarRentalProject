package com.example.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.BookingNotFoundException;
import com.example.persistence.domain.Booking;
import com.example.persistence.repository.BookingRepository;
import com.example.rest.dto.BookingDTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Service
@AllArgsConstructor
@Data
public class BookingService {
	@Autowired
	private BookingRepository repo;
	@Autowired
	private ModelMapper mapper;
	
	private BookingDTO mapToDTO(Booking booking) {
		return this.mapper.map(booking, BookingDTO.class);
	}
	
	public BookingDTO addBooking(Booking booking){
		Booking saved = this.repo.save(booking);
		return this.mapToDTO(saved);
	}
	
	public List<BookingDTO> getAllBookings(){
		return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}
	
	public BookingDTO updateBooking(Long uniquebookingnumber, Booking booking) {
		Optional<Booking> tempBooking = Optional.of(this.repo.findById(uniquebookingnumber).orElseThrow(BookingNotFoundException::new));
		Booking existing = tempBooking.get();
		
		existing.setUniquebookingnumber(booking.getUniquebookingnumber());
		existing.setBookingdate(booking.getBookingdate());
		existing.setBookingtime(booking.getBookingtime());
		existing.setVehicletype(booking.getVehicletype());
		existing.setNumberofdays(booking.getNumberofdays());
		existing.setBookingdateout(booking.getBookingdateout());
		existing.setBookingtimeout(booking.getBookingtimeout());
		existing.setBookingdatereturn(booking.getBookingdatereturn());
		existing.setBookingtimereturn(booking.getBookingtimereturn());
		existing.setCarnumber(booking.getCarnumber());
		existing.setDispatcherID(booking.getDispatcherID());
		existing.setBookingdispatched(booking.getBookingdispatched());
		existing.setBookingstatus(booking.getBookingstatus());
		
		
		Booking updated = this.repo.save(existing);
		return this.mapToDTO(updated);
	}
	
	public boolean deleteBooking(Long id) {
		this.repo.findById(id).orElseThrow(BookingNotFoundException::new);
		this.repo.deleteById(id);
		boolean exists = this.repo.existsById(id);
		return !exists;
	}
	
	public BookingDTO readById(Long id) {
		Booking found =  this.repo.findById(id).orElseThrow(BookingNotFoundException::new);
		return this.mapToDTO(found);
	}
	
	

}

/*
existing.setName(booking.getName());
existing.setStrings(booking.getStrings());
existing.setType(booking.getType());
existing.setCar(booking.getCar());    45-48*/