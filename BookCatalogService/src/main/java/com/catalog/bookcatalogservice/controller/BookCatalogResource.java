package com.catalog.bookcatalogservice.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.catalog.bookcatalogservice.model.Book;
import com.catalog.bookcatalogservice.model.BookCatalogItem;
import com.catalog.bookcatalogservice.model.UserRating;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/bookcatalog")
public class BookCatalogResource {
	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "fallback", groupKey = "catalog",
	            commandKey = "catalog",
	            threadPoolKey = "catalogThread"
	            )
	@RequestMapping("/user/{userId}")
	public List<BookCatalogItem> getBookCatalog(@PathVariable("userId") String userId) {
		UserRating userRating=restTemplate.getForObject("http://zuul-server/api/rating/bookRating/user/" + userId, UserRating.class);
		return userRating.getRatings().stream().map(rating-> {
			Book book=restTemplate.getForObject("http://book-info-service/books/"+rating.getBookId(), Book.class);
		   return new BookCatalogItem(book.getBookId(), book.getBookName(), rating.getBookRating());
		}).collect(Collectors.toList());
	}
	
	public List<BookCatalogItem> fallback(String id, Throwable hystrixCommand) {
        return Arrays.asList(new BookCatalogItem("No Item", "Book Service is not available", 0));
    }
}
