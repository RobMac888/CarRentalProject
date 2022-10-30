package com.example.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.CarNotFoundException;
import com.example.persistence.domain.Car;
import com.example.persistence.repository.CarRepository;
import com.example.rest.dto.CarDTO;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CarService {
	@Autowired
	private CarRepository repo;
	@Autowired
	private ModelMapper mapper;
	
	private CarDTO mapToDTO(Car car) {
		return this.mapper.map(car, CarDTO.class);
	}
	
	public CarDTO addCar(Car car) {  
		Car saved = this.repo.save(car);
		return this.mapToDTO(saved);
	}
	
	public List<CarDTO> getAllCars() {
		return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}
	
	public CarDTO updateCar(Integer carnumber, Car car) {
		Optional<Car> tempCar = Optional.of(this.repo.carByCarNumber(carnumber).orElseThrow(CarNotFoundException::new));
		
		Car existing = tempCar.get();
		
		existing.setCarNumber(car.getCarNumber());
		existing.setCarMake(car.getCarMake());
		existing.setCarYear(car.getCarYear());
		existing.setModel(car.getModel());
		existing.setCarLocation(car.getCarLocation());
		existing.setCarStatus(car.getCarStatus());
		existing.setCarRegistrationNumber(car.getCarRegistrationNumber());
		
		Car updated = this.repo.save(existing);
		return this.mapToDTO(updated);
	}
	
	public boolean deleteCar(Integer carnumber) {
		this.repo.findById(carnumber).orElseThrow(CarNotFoundException::new);
		this.repo.deleteById(carnumber);
		boolean exists = this.repo.existsById(carnumber);
		return !exists;
	}
	
	public CarDTO readByCarnumber(Integer carnumber) {
    Car found = this.repo.findByCarnumber(carnumber).orElseThrow(CarNotFoundException::new);
    return this.mapToDTO(found);
    }
	
	public CarDTO readByModel(String Model) {
		Car found = this.repo.carByModel(Model).orElseThrow(CarNotFoundException::new);
		return this.mapToDTO(found);
	}
	
}