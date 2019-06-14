package com.rating.bookratingservice.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserRating {
private String userId;
private List<BookRating> ratings=new ArrayList<>();

public UserRating() {
	// TODO Auto-generated constructor stub
}
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
public void getUserRatings(String userId2) {
	this.setUserId(userId2);
	this.setRatings(Arrays.asList(new BookRating("1", 4),new BookRating("2", 5)));
}


}
