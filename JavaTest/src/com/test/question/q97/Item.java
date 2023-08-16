package com.test.question.q97;

import java.util.Calendar;

class Item {
	private String name;
	private Calendar expiration;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExpiration() {
		String result="";
		result=String.format("%tF", this.expiration);
		
		
		return result;
	}
	public void setExpiration(String expiration) {
		Calendar ex=Calendar.getInstance();
		String[] sp=expiration.split("-");
		
		ex.set(Integer.parseInt(sp[0]) , Integer.parseInt(sp[1])-1, Integer.parseInt(sp[2]));
		
		this.expiration = ex;
	}
	
	
	
	
	
}