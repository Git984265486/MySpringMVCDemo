package com.mvc.example.entity;

public class User {
	
	long id;			//用户id
	String username;	//用户名【学号】
	String password;	//密码
	String realName;	//真实姓名
	String phone;		//电话号码
	String email;		//电子邮箱
	String grants;		//用户权限 0普通用户、1管理员
	String userType;	//用户类型 0学生、1老师
	String userStatus;	//账户状态 0冻结、1正常
	String fingerMark;  //用户掌脉 0未录入、1已录入
	String remark;		//备注信息
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGrants() {
		return grants;
	}
	public void setGrants(String grants) {
		this.grants = grants;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	
	public String getFingerMark() {
		return fingerMark;
	}
	public void setFingerMark(String fingerMark) {
		this.fingerMark = fingerMark;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
