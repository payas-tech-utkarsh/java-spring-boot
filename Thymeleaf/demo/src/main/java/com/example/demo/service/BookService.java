package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Book;

public interface BookService {

	public List<Book> getBooks();
	
	public void addBook(Book book);
	
	public void deleteBook(Book book);
	
}
