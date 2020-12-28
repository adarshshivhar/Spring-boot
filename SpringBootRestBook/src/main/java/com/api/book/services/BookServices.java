package com.api.book.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.api.book.modal.Book;

@Component
public class BookServices {
	
	private static List<Book> list = new ArrayList<>();
	
	static {
		list.add(new Book(11, "abcd", "efgh"));
		list.add(new Book(12, "abcde", "efghe"));
		list.add(new Book(13, "abcdg", "efghg"));
	}
	
	//get all books
	public List<Book> getBooks() {
		return list;
	}
	
	//get specific book
	public Book getBookById(int id) {
		Book book = null;
		
		book = list.stream().filter(e -> e.getId()==id).findFirst().get();
		
		return book;
	}
	
	//Add book to list
	public Book addBookToList(Book book) {
		list.add(book);
		return book;
	}

	public void deleteBookById(int id) {
		
		list = list.stream().filter(e -> e.getId() != id).collect(Collectors.toList());
	}

	public void updateBook(Book book, int id) {
		
		list.stream().map(e -> {
			if(e.getId() == id) {
				e.setTitle(book.getTitle());
				e.setAuthor(book.getAuthor());
			}
			return e;
		}).collect(Collectors.toList());
		
	}
}
