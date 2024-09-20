package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Book;
import com.demo.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService bookService;

	@PostMapping("/saveBook")
	public Book saveBook(@RequestBody Book book) {
		Book saveBook = bookService.saveBook(book);
		return saveBook;
	}

	@GetMapping("/getBooks")
	public List<Book> getBooks(Book book) {
		List<Book> list = bookService.getBooks(book);
		return list;
	}

	@GetMapping("/getBook/{id}")
	public Book getBook(@PathVariable("id") Integer id) {
		Book book = bookService.getBook(id);
		return book;
	}

	@DeleteMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable("id") Integer id) {
		String str = bookService.deleteBook(id);
		return str;
	}
}
