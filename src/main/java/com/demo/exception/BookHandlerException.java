package com.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BookHandlerException {

	// Design one handler method
	@ExceptionHandler(value = { BookNotFoundException.class })
	public ResponseEntity<Object> handleBook(BookNotFoundException bookNotFoundException) {
		BookException bookException = new BookException(bookNotFoundException.getMessage());
		return new ResponseEntity<>(bookException, HttpStatus.NOT_FOUND);
	}
}
