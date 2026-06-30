package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler({MethodArgumentNotValidException.class})
	public ResponseEntity<?> arpitaPatil(MethodArgumentNotValidException e) {
		Map<String, String> error = new HashMap<>();
		e.getBindingResult().getFieldErrors().forEach(x -> error.put(x.getField(), x.getDefaultMessage()));
		return ResponseEntity.status(700).body(error);
	}
}
