package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Book;
import com.example.demo.repository.BookRepository;

@Component
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bkRepo;
	
	@Override
	public List<Book> getBooks() {
		
		return bkRepo.findAll();
	}

	@Override
	public void addBook(Book book) {
		bkRepo.save(book);
	}

	@Override
	public void deleteBook(Book book) {
		bkRepo.delete(book);
	}

}
