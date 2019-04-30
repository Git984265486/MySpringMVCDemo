package com.mvc.example.repository;

import org.apache.ibatis.annotations.Select;

import com.mvc.example.entity.User;

public interface UserRepository {

	@Select("select * from Tuser where id=#{id}")
	public User selUserById(long id);
	
}
