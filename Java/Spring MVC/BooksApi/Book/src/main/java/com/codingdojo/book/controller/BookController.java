package com.codingdojo.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codingdojo.book.models.Book;
import com.codingdojo.book.services.BookService;

@Controller
public class BookController {
@Autowired
BookService bookservice;
@GetMapping("/books/{bookId}")
public String getById(@PathVariable ("bookId") Long bookId,Model model) {
	Book book = bookservice.findBook(bookId);
	model.addAttribute("book",book);
	return "index.jsp";
	
}
@GetMapping("/books")
public String getAllBooks(Model model) {
	List<Book> allBooks=bookservice.allBooks();
	model.addAttribute("books",allBooks);
	return "allBooks.jsp";
}
}
