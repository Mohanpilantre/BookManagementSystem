package com.demo.service;

import java.util.List;

import com.demo.model.Book;

public interface BookService {

	public Book saveBook(Book book);
	
	public List<Book> getBooks(Book book);
	
	public Book getBook(Integer id);
	
	public String deleteBook(Integer id);
	
}
