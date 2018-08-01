package com.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.web.services.UserService;
import com.web.DTO.*;

@Controller
public class UsersController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("user") User user) {
		userService.addUser(user);
		return new ModelAndView("redirect:/add");
	}

	@RequestMapping("/")
	public String showHome() {
		return "home";
	}

	@RequestMapping("/add")
	public ModelAndView showAdd() {
		ModelAndView model = new ModelAndView("add", "command", new User());
		return model;
	}

	@RequestMapping("/show")
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("users", userService.getAllOffer());
		modelAndView.setViewName("show");
		return modelAndView;
	}

}
