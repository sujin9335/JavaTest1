package com.erp.model.vo;

public class LoginMember {

	String num;
	String id;
	String ps;
	String name;
	String lv;
	
	public LoginMember() {
		// TODO Auto-generated constructor stub
	}

	public LoginMember(String num, String id, String ps, String name, String lv) {
		super();
		this.num = num;
		this.id = id;
		this.ps = ps;
		this.name = name;
		this.lv = lv;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPs() {
		return ps;
	}

	public void setPs(String ps) {
		this.ps = ps;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLv() {
		return lv;
	}

	public void setLv(String lv) {
		this.lv = lv;
	}

	@Override
	public String toString() {
		return "LoginMember [num=" + num + ", id=" + id + ", ps=" + ps + ", name=" + name + ", lv=" + lv + "]";
	}
	
	
	
	
}
