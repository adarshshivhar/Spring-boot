package com.api.book.services;

import java.util.ArrayList;
import java.util.List;

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
}
