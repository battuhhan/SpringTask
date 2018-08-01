package com.web.DTO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
	private List<User> offers = new ArrayList<User>();
	
	public UserDAO() {
	}
	
	
	public List<User> getOffers(){
		return offers;
	}
	
	
}
