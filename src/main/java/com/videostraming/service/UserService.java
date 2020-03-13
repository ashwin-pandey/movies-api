package com.videostraming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.videostraming.bean.User;
import com.videostraming.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	public UserRepository userRepository;
	
	public List<User> getAllUsers() {
		return userRepository.getAllUsers();
	}

}
