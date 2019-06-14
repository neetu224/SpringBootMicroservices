package com.rating.bookratingservice.model;

public class BookRating {
	private String bookId;
	private int bookRating;
	
	public BookRating() {
		
	}
	public BookRating(String bookId, int bookRating) {
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
