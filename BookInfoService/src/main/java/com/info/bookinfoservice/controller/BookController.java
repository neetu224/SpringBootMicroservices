package com.info.bookinfoservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.bookinfoservice.model.Book;

@RestController
@RequestMapping("/books")
public class BookController {

@RequestMapping("/{bookId}")
public Book getBooks(@PathVariable("bookId") String bookId) {
	Book book=new Book(bookId, "Alchemist", "Paulo coehleo");
	return book;
}
	
	
}
