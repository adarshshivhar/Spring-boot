package com.api.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.modal.Book;
import com.api.book.services.BookServices;

@RestController
public class BookController {
	
	@Autowired
	private BookServices bookService;
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		
		return bookService.getBooks();
	}
	
	@GetMapping("/books/{id}")
	public Book getBookById(@PathVariable("id") int id) {
		
		return bookService.getBookById(id);
	}
	
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		Book b = bookService.addBookToList(book);
		return b;
	}
	
	@DeleteMapping("/books/{id}")
	public String addBook(@PathVariable("id") int id) {
		bookService.deleteBookById(id);
		return "Book Deleted";
	}
}
