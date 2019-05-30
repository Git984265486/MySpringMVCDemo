package com.mvc.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.mvc.example.entity.User;

public interface UserRepository {

	
	/**------【通过用户id获取用户信息】------**/
	
	@Select("select * from Tuser where id=#{id}")
	public User selUserById(long id);
	
	
	
	
	
	/**------【获取所有用户信息】------**/
	
	@Select("select * from TUser limit #(page) 10")
	public List<User> getAllUser(int page);
	
	
	
	
	
	/**------【获取用户总数】------**/
	
	@Select("select COUNT(*) from TUser")
	public int getAllUserCount();
	
	
	
	
	
	/**------【获取用户掌脉数值为0的用户】------**/
	
	@Select("select * from TUser where fingerMark='0' limit #(page) 10")
	public List<User> selUserByFingerMark(String fingerMark,int page);
	
	
	
	
	
	/**------【新增用户信息】------**/
	
	@Insert("insert into TUser(username,password,realName,phone,email,grants,userType,userStatus,"
			+ "fingerMark,remark) value (#{username},#{password},#{realName},#{phone},"
			+ "#{email},#{grants},#{userType},#{userStatus},#{fingerMark},#{remark})")
	public boolean insertUser(User user);
	
	
	
	
	
	/**------【通过用户id更新用户信息】------**/
	
	@Update("update TUser set id=#{id},username=#{username},password=#{password},realName=#{realName},"
			+ "phone=#{phone},email=#{email},grants=#{grants},userType=#{userType},userStatus=#{userStatus},"
			+ "fingerMark=#{fingerMark},remark=#{remark}")
	public boolean UpdateUser(User User);
	
	
	
	
	
	/**------【通过用户id删除用户信息】------**/
	
	@Delete("delete from TUser where id=#{id}")
	public boolean DeleteUserById(long id);
	
}
