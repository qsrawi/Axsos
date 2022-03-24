package com.codingdojo.loginandregist.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.loginandregist.models.Book;
import com.codingdojo.loginandregist.models.User;
import com.codingdojo.loginandregist.services.BookService;
import com.codingdojo.loginandregist.services.UserService;

@Controller
public class BookController {
@Autowired
BookService bookService;
@Autowired
UserService userService;
//@GetMapping("/books/{bookId}")
//public String getById(@PathVariable ("bookId") Long bookId,Model model) {
//	Book book = bookservice.findBook(bookId);
//	model.addAttribute("book",book);
//	return "index.jsp";
//	
//}


@GetMapping("/books")
public String getAllBooks(Model model,HttpSession session) {
	if (session.getAttribute("user_id") == null) {
		return "redirect:/";
		}
		else {
			Long id =(Long)session.getAttribute("user_id");
			User thisUser =userService.findUser(id);
			List<Book> allBooks=bookService.allBooks();
			model.addAttribute("books",allBooks);
			model.addAttribute("thisUser",thisUser);
			return "books.jsp";
		}

}

@GetMapping("/books/new")
public String AddBook(@ModelAttribute("book") Book book) {
	return "add.jsp";
}

@PostMapping("books/new")
public String createBook(HttpSession session,@Valid @ModelAttribute("book") Book book,BindingResult result) {
	 if (result.hasErrors()) {
	        return "add.jsp";
	    } else {
	    	Long id =(Long)session.getAttribute("user_id");
	    	User thisUser =userService.findUser(id);
	    	book.setUser(thisUser);
	    	bookService.createBook(book);
	        return "redirect:/books";
	    }
	 }


@GetMapping("books/{id}")
public String details(Model model,HttpSession session,@PathVariable Long id) {
	Long userId =(Long)session.getAttribute("user_id");
	User thisUser =userService.findUser(userId);
	Book thisBook = bookService.findBook(id);
	model.addAttribute("thisUser",thisUser);
	model.addAttribute("thisBook",thisBook);
	return "show.jsp";
}

@GetMapping("books/{id}/edit")
public String showEdit(Model model,HttpSession session,@ModelAttribute("book") Book book,@PathVariable Long id) {
	Long userId =(Long)session.getAttribute("user_id");
	User thisUser =userService.findUser(userId);
	Book thisBook = bookService.findBook(id);
	model.addAttribute("thisUser",thisUser);
	model.addAttribute("thisBook",thisBook);
	return "edit.jsp";
}

@PutMapping("books/{id}/edit")
public String edit(@Valid @ModelAttribute("book") Book book) {
	bookService.update(book);
	return "redirect:/books";
}

@GetMapping("/logout")
public String logout(HttpServletRequest request){
    HttpSession httpSession = request.getSession();
    httpSession.invalidate();
    return "redirect:/";


}
}
