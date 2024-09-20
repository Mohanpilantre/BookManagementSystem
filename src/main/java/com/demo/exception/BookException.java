package com.demo.exception;

public class BookException {

	private final String message;

	public BookException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
