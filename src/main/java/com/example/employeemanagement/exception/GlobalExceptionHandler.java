package com.example.employeemanagement.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleResourceNotFoundException(ResourceNotFoundException ex){
		ErrorResponse error = new ErrorResponse(HttpStatus.NOT_FOUND.value(),ex.getMessage(),LocalDateTime.now().toString());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
		public ResponseEntity<ErrorResponse> handleMethodArgumentValidException(MethodArgumentNotValidException ex){
			String errorMessage = ex.getBindingResult().getFieldErrors().get(0).getDefaultMessage();
			ErrorResponse error = new ErrorResponse(HttpStatus.BAD_REQUEST.value(),errorMessage,LocalDateTime.now().toString());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
		}
}
