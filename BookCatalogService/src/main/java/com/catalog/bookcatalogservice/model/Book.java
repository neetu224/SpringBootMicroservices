package com.catalog.bookcatalogservice.model;

public class Book {
private String bookId;
private String bookName;
private String bookDescription;

public Book() {
	// TODO Auto-generated constructor stub
}
public Book(String bookId, String bookName, String bookDescription) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.bookDescription = bookDescription;
}
public String getBookId() {
	return bookId;
}
public void setBookId(String bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getBookDescription() {
	return bookDescription;
}
public void setBookDescription(String bookDescription) {
	this.bookDescription = bookDescription;
}



}
