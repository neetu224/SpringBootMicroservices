package com.rating.bookratingservice.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRating {
	private String userId;
	private List<BookRating> ratings = new ArrayList<>();

	public void getUserRatings(String userId2) {
		this.setUserId(userId2);
		this.setRatings(Arrays.asList(new BookRating("1", 4), new BookRating("2", 5)));
	}

}
