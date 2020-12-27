package com.api.book.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.api.book.modal.Book;

@Component
public class BookServices {
	
	private static List<Book> list = new ArrayList<>();
	
	static {
		list.add(new Book(11, "abc", "def"));
		list.add(new Book(12, "abcd", "defg"));
		list.add(new Book(13, "abcde", "defgh"));
		
	}
	//get all books
	public List<Book> getAllBooks() {
		return list;
	}
	
	//get Book by id 
	public Book getBookById(int id) {
		Book book = null;
		book = list.stream().filter(e -> e.getId()== id).findFirst().get();
		return book;
	}
	
}
