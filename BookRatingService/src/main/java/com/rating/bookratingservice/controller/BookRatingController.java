package com.rating.bookratingservice.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.bookratingservice.model.BookRating;
import com.rating.bookratingservice.model.UserRating;

@RestController
@RequestMapping("/ratings")
public class BookRatingController {

@RequestMapping("/book/{bookId}")
public BookRating getBookRating(@PathVariable("bookId") String bookId) {
	return new BookRating(bookId, 4);
}

@RequestMapping("/user/{userId}")
public UserRating getUserRating(@PathVariable("userId") String userId) {
	UserRating userRating=new UserRating();
	userRating.setUserId(userId);
	userRating.setRatings(Arrays.asList(new BookRating("1", 4),new BookRating("2", 5)));
	return userRating;
	
}
	
}
