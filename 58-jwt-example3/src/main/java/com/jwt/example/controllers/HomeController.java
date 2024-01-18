package com.jwt.example.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.example.models.User;
import com.jwt.example.services.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private UserService userService;

    //http://localhost:8080/home/user
	@GetMapping("/user")
	public List<User> getUser() {
		System.out.println("getting users");
		return this.userService.getUser();
	}
	
	//http://localhost:8080/home/current-user
	@GetMapping("/current-user")//to get the name the user name
	public String getLoggedInUser(Principal principal) {
		return principal.getName();
	}


}