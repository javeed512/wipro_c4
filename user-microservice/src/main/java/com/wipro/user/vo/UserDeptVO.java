package com.wipro.user.vo;

import com.wipro.user.entity.User;

public class UserDeptVO { // pojo for user+dept
	
	private  User user;
	private Department dept;
	
	
	
	
	public UserDeptVO(User user, Department dept) {
		super();
		this.user = user;
		this.dept = dept;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	

}
