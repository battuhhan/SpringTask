package com.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.DTO.*;

@Service
public class UserService {
	@Autowired
	private UserDAO userDAO;
	public List<User> getAllOffer(){
		return userDAO.getOffers();
	}
	
	public void addUser(User user) {
		userDAO.getOffers().add(user);
	}
	
}
