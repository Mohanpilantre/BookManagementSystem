package com.demo.exception;

public class BookNotFoundException extends RuntimeException {

	public BookNotFoundException(String message) {
		super(message);
	}
}