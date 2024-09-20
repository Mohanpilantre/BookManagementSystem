package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.exception.BookNotFoundException;
import com.demo.model.Book;
import com.demo.repository.BookRepository;
import com.demo.service.BookService;

@Service
public class BookImpl implements BookService {

	@Autowired
	BookRepository bookRepository;

	@Override
	public Book saveBook(Book book) {
		Book savebook = bookRepository.save(book);
		return savebook;
	}

	@Override
	public List<Book> getBooks(Book book) {
		List<Book> list = bookRepository.findAll();
		return list;
	}

	@Override
	public Book getBook(Integer id) {
		Book book = bookRepository.findById(id);
		if(book==null) {
			throw new BookNotFoundException("Book Id Not Found");
		}
		return book;
	}

	@Override
	public String deleteBook(Integer id) {
		bookRepository.deleteById(id);
		return "Book Details Deleted Successfully....";
	}

}
