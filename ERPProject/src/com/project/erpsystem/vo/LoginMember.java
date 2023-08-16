package com.project.erpsystem.vo;

public class LoginMember { //로그인 저장 멤버

	String no;
	String id;
	String pw;
	String employeeNo;
	String lv;
	
	public LoginMember() {
		// TODO Auto-generated constructor stub
	}

	public LoginMember(String no, String id, String pw, String employeeNo, String lv) {
		super();
		this.no = no;
		this.id = id;
		this.pw = pw;
		this.employeeNo = employeeNo;
		this.lv = lv;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getLv() {
		return lv;
	}

	public void setLv(String lv) {
		this.lv = lv;
	}

	@Override
	public String toString() {
		return "LoginMember [no=" + no + ", id=" + id + ", pw=" + pw + ", employeeNo=" + employeeNo + ", lv=" + lv
				+ "]";
	}

	
	
	
}
