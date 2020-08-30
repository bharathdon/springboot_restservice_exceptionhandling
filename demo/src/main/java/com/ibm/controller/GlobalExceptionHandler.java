package com.ibm.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = NoEmployeeFoundException.class)
	public ResponseEntity<CustomErrorResponse> handleNoEmpFoundException(NoEmployeeFoundException exception, WebRequest request) {
		CustomErrorResponse customErrorResponse = new CustomErrorResponse();
		customErrorResponse.setLocalDateTime(LocalDateTime.now());
		customErrorResponse.setError(exception.getMessage());
		customErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<CustomErrorResponse>(customErrorResponse, HttpStatus.NOT_FOUND);

	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<CustomErrorResponse> handleException(NoEmployeeFoundException exception, WebRequest request) {
		CustomErrorResponse customErrorResponse = new CustomErrorResponse();
		customErrorResponse.setLocalDateTime(LocalDateTime.now());
		customErrorResponse.setError(exception.getMessage());
		customErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<CustomErrorResponse>(customErrorResponse, HttpStatus.NOT_FOUND);

	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<CustomErrorResponse> customValidation(MethodArgumentNotValidException exception){
		CustomErrorResponse customErrorResponse = new CustomErrorResponse();
		customErrorResponse.setLocalDateTime(LocalDateTime.now());
		customErrorResponse.setError(exception.getBindingResult().getFieldError().getDefaultMessage());
		customErrorResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		return new ResponseEntity<CustomErrorResponse>(customErrorResponse,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
