package com.catalog.bookcatalogservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BookCatalogItem {
	private String id;
	private String name;
	private int rating;
}
