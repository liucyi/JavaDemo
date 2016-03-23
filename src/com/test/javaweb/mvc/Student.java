package com.test.javaweb.mvc;

import java.util.Date;

public class Student {


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	private Integer id;
	public Student(Integer id, String userName, String passWord,
			Date createTime, int status) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.createTime = createTime;
		this.status = status;
	}
	private String userName;
	private String passWord;
	private Date createTime;
	private int status;

	 

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
