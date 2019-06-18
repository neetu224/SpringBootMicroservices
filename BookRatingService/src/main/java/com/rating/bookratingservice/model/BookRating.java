package com.rating.bookratingservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BookRating {
	private String bookId;
	private int bookRating;
}
