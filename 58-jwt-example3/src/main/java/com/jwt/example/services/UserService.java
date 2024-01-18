package com.jwt.example.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.example.models.User;

@Service
public class UserService {
	
	private List<User> store=new ArrayList<>();

	public UserService() {
		store.add(new User(UUID.randomUUID().toString(),"Durgest Tiwari","durgesh@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Harse Tiwari","harse@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Ankit Tiwari","ankit@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Gautam Tiwari","gautam@gmail.com"));
	}
	public List<User> getUser(){
		return this.store;
	}
	
	

}
