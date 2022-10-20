package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entities.Book;
import com.example.demo.service.BookService;

@Controller
public class NewController {

	@Autowired
	BookService bkService;
	
	@GetMapping("/books")
	public String getBooks(Model model) {
		model.addAttribute("books", bkService.getBooks());
		return "books";
	}
	
	// Method to redirect to add book page
	@GetMapping("/add-book-page")
	public String goToAddBook(Model model) {
		Book book = new Book();
		model.addAttribute("book", book);
		return "add-book";
	}
	
	@PostMapping("/save-book")
	public String saveBook(@ModelAttribute ("book") Book book, Model model) {
		
		bkService.addBook(book);
		
		return "redirect:/books";
	}
	
}
