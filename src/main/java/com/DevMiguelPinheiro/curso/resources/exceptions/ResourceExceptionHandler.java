package com.DevMiguelPinheiro.curso.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.DevMiguelPinheiro.curso.services.exceptions.DatabaseException;
import com.DevMiguelPinheiro.curso.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {
		String error = "Resource not found";
		HttpStatus stts = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(), stts.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(stts).body(err);
	}
	
	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StandardError> database(ResourceNotFoundException e, HttpServletRequest request) {
		String error = "Resource not found";
		HttpStatus stts = HttpStatus.BAD_REQUEST;
		StandardError err = new StandardError(Instant.now(), stts.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(stts).body(err);
	}
}