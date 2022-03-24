package com.codingdojo.loginandregist.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.loginandregist.models.Book;
import com.codingdojo.loginandregist.repos.BookRepo;

@Service
public class BookService {
@Autowired
BookRepo bookRepo;

//returns all the books
public List<Book> allBooks() {
    return bookRepo.findAll();
}
// creates a book
public Book createBook(Book b) {
    return bookRepo.save(b);
}
// retrieves a book
public Book findBook(Long id) {
    Optional<Book> optionalBook = bookRepo.findById(id);
    if(optionalBook.isPresent()) {
        return optionalBook.get();
    } else {
        return null;
    }
}
//Update
public Book update(Book book) {
	Book updatedbook = bookRepo.findById(book.getId()).orElse(null);
	updatedbook.setTitle(book.getTitle());
	updatedbook.setAuthor(book.getAuthor());
	updatedbook.setMyThoughts(book.getMyThoughts());
    	return bookRepo.save(updatedbook);
}

}
