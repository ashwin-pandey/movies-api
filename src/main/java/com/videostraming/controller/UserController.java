package com.videostraming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.videostraming.bean.User;
import com.videostraming.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	public UserService userService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/api/user/all")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

}
