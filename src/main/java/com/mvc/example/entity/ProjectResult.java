package com.mvc.example.entity;

public class ProjectResult {

	long id;				//项目成果id
	long tProject_id;		//项目id
	long tUser_id;			//操作人id
	String resultType;		//获奖类别	0获奖/1专利/2成果转让
	String contestName;		//赛事名称
	String prizeLevel;		//获奖等级		校级/省级/国家/国际
	String prizeName;		//获奖奖项		一等、二等奖等
	String prizeFile;		//获奖图片		文件路径
	int prizeYear;			//获奖年份
	String patentName;		//专利名称
	String patentFile;		//专利文件/图片		文件路径
	int patentYeat;			//专利年份
	String resultTransfer;	//成果转让		成果转让情况描述，未转让值为空
	String resultFile;		//成果转让文件/图片		文件路径
	int resultYear;			//成果转让年份
	String remark;			//备注信息
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long gettProject_id() {
		return tProject_id;
	}
	public void settProject_id(long tProject_id) {
		this.tProject_id = tProject_id;
	}
	public long gettUser_id() {
		return tUser_id;
	}
	public void settUser_id(long tUser_id) {
		this.tUser_id = tUser_id;
	}
	public String getResultType() {
		return resultType;
	}
	public void setResultType(String resultType) {
		this.resultType = resultType;
	}
	public String getContestName() {
		return contestName;
	}
	public void setContestName(String contestName) {
		this.contestName = contestName;
	}
	public String getPrizeLevel() {
		return prizeLevel;
	}
	public void setPrizeLevel(String prizeLevel) {
		this.prizeLevel = prizeLevel;
	}
	public String getPrizeName() {
		return prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}
	public String getPrizeFile() {
		return prizeFile;
	}
	public void setPrizeFile(String prizeFile) {
		this.prizeFile = prizeFile;
	}
	public int getPrizeYear() {
		return prizeYear;
	}
	public void setPrizeYear(int prizeYear) {
		this.prizeYear = prizeYear;
	}
	public String getPatentName() {
		return patentName;
	}
	public void setPatentName(String patentName) {
		this.patentName = patentName;
	}
	public String getPatentFile() {
		return patentFile;
	}
	public void setPatentFile(String patentFile) {
		this.patentFile = patentFile;
	}
	public int getPatentYeat() {
		return patentYeat;
	}
	public void setPatentYeat(int patentYeat) {
		this.patentYeat = patentYeat;
	}
	public String getResultTransfer() {
		return resultTransfer;
	}
	public void setResultTransfer(String resultTransfer) {
		this.resultTransfer = resultTransfer;
	}
	public String getResultFile() {
		return resultFile;
	}
	public void setResultFile(String resultFile) {
		this.resultFile = resultFile;
	}
	public int getResultYear() {
		return resultYear;
	}
	public void setResultYear(int resultYear) {
		this.resultYear = resultYear;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
