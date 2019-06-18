package com.info.bookinfoservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Book {
	private String bookId;
	private String bookName;
	private String bookDescription;
}
