package com.example.exception;

import javax.persistence.EntityNotFoundException;

import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.http.HttpStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "CarNumber does not exist/check entry again")
public class CarNotFoundException extends EntityNotFoundException{
	public CarNotFoundException() {}
	public CarNotFoundException(String msg) {
		super(msg);
	}

}