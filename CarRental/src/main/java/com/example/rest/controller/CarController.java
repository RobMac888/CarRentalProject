package com.example.rest.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.persistence.domain.Car;
import com.example.rest.dto.CarDTO;
import com.example.service.CarService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CarController {
	@Autowired
	private CarService service;
	
	@PostMapping("/addCar")
	public CarDTO addcar(@RequestBody Car car) {
		return service.addCar(car);
	}
	
	@GetMapping("/allCars")
	public List<CarDTO> getAllCars(){
		return service.getAllCars();
	}
	
	@PutMapping("/updateCar/{carnumber}")
	public CarDTO updateCar(@PathVariable Integer carnumber, @RequestBody Car car) {
		return service.updateCar(carnumber, car);
	}
	
	@DeleteMapping("/deleteCar/{carnumber}")
	public boolean deleteCar(@PathVariable Integer carnumber) {
		return service.deleteCar(carnumber);
	}
	
	@GetMapping("/carByCarNumber")
	public CarDTO readCarByCarNumber(@PathParam("carnumber") Integer carnumber) {
		return service.readByCarnumber(carnumber);
	}
	
	@GetMapping("/carByModel")
	public CarDTO readByModel(@PathParam("model") String model){
		return service.readByModel(model);
	}

}