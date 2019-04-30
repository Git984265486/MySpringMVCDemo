package com.mvc.example.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mvc.example.entity.User;
import com.mvc.example.repository.UserRepository;

@Service
public class UserService {
	
	@Resource
	private UserRepository userRepository;
	
	public User selUserById(long id) {
		return userRepository.selUserById(id);
	}
	
}
