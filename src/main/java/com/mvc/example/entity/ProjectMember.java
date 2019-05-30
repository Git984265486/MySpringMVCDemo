package com.mvc.example.entity;

public class ProjectMember {

	long id;			//项目成员id
	long tUser_id;		//用户id，TUsers表外键
	long tProject_id;	//项目id，TProject表外键
	String isLeader;	//是否项目负责人	0否，1是
	String isAdviser;	//是否指导老师	0否，1是
	String remark;		//备注信息
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long gettUser_id() {
		return tUser_id;
	}
	public void settUser_id(long tUser_id) {
		this.tUser_id = tUser_id;
	}
	public long gettProject_id() {
		return tProject_id;
	}
	public void settProject_id(long tProject_id) {
		this.tProject_id = tProject_id;
	}
	public String getIsLeader() {
		return isLeader;
	}
	public void setIsLeader(String isLeader) {
		this.isLeader = isLeader;
	}
	public String getIsAdviser() {
		return isAdviser;
	}
	public void setIsAdviser(String isAdviser) {
		this.isAdviser = isAdviser;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
