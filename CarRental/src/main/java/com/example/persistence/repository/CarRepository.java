package com.example.persistence.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.persistence.domain.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer>{
	
	@Query("select b from Car b where b.name=?1")

	Optional<Car> carByCarNumber(Integer carnumber);

	Optional<Car> carByModel(String model);

	Optional<Car> findByCarnumber(Integer carnumber);
}