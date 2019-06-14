package com.catalog.bookcatalogservice.model;

public class BookRating {
	private String bookId;
	private int bookRating;
	
	public BookRating() {
		// TODO Auto-generated constructor stub
	}

	public BookRating(String bookId, int bookRating) {
		super();
		this.bookId = bookId;
		this.bookRating = bookRating;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public int getBookRating() {
		return bookRating;
	}

	public void setBookRating(int bookRating) {
		this.bookRating = bookRating;
	}
}
