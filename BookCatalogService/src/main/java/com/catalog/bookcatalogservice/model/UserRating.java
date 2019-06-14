package com.catalog.bookcatalogservice.model;

import java.util.ArrayList;
import java.util.List;

public class UserRating {
private String userId;
private List<BookRating> ratings;
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public List<BookRating> getRatings() {
	return ratings;
}
public void setRatings(List<BookRating> ratings) {
	this.ratings = ratings;
}
}
