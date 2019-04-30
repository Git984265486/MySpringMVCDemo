package com.mvc.example.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.example.entity.User;
import com.mvc.example.service.UserService;

@Controller
public class UserController {
	
	@Resource
	private UserService userService;
	

	@RequestMapping(value="selUserById")
	@ResponseBody
	public Map<String , Object> selUserById(){
		
		Map<String , Object> map = new HashMap<>();
		
		long userid = 1001;
		
		User user = userService.selUserById(userid);
		
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		
		map.put("user", user);
		
		return map;
	}
	
	
}
