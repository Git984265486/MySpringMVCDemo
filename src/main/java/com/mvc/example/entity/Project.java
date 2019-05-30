package com.mvc.example.entity;

import java.util.Date;

public class Project {

	long id;			//项目id
	String proName;		//项目名称
	String proType;		//项目类型 0（创新项目） 1（竞赛项目）2（企业项目）3（其他）
	Date startTime; 	//开始时间
	Date endTime;		//结束时间
	String showLink;	//展示路径
	long tUser_id;		//用户id
	String remark;		//备注信息
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getProType() {
		return proType;
	}
	public void setProType(String proType) {
		this.proType = proType;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getShowLink() {
		return showLink;
	}
	public void setShowLink(String showLink) {
		this.showLink = showLink;
	}
	public long gettUser_id() {
		return tUser_id;
	}
	public void settUser_id(long tUser_id) {
		this.tUser_id = tUser_id;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
