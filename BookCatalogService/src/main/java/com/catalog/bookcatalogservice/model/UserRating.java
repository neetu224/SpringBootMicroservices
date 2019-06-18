package com.catalog.bookcatalogservice.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRating {
	private String userId;
	private List<BookRating> ratings;
}
