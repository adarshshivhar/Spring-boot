package com.api.book.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.modal.Book;
import com.api.book.services.BookServices;

@RestController
public class BookController {
	
	@Autowired
	private BookServices bookService;
	
	@GetMapping("/books")
	public List<Book> getBooks() {
		
		return bookService.getAllBooks();
		
	}
	
	@GetMapping("/books/{id}")
	public Book getBookById(@PathVariable("id") int id) {
		
		return bookService.getBookById(id);
		
	}
}
