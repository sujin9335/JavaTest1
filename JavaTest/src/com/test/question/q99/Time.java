package com.test.question.q99;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		this.hour=0;
		this.minute=0;
		this.second=0;
	}
	
	public Time(int hour, int minute, int second) {
		if(second/60 != 0) {
			this.second=second%60;
			this.minute=second/60%60;
			this.hour=second/60/60;
		}else {
			this.second=second;
		}
		
		if(minute/60 != 0) {
			this.minute=minute%60;
			this.hour+=minute/60;
		}else {
			this.minute=minute;
		}
		
		this.hour+=hour;
	}
	
	public Time(int minute, int second) {
		this.hour=0;
		
		if(second/60 != 0) {
			this.second=second%60;
			this.minute=second/60%60;
			this.hour=second/60/60;
		}else {
			this.second=second;
		}
		
		if(minute/60 != 0) {
			this.minute=minute%60;
			this.hour+=minute/60;
		}else {
			this.minute=minute;
		}
	}
	
	public Time(int second) {
		this.hour=0;
		
		this.minute=0;
		
		if(second/60 != 0) {
			this.second=second%60;
			this.minute=second/60%60;
			this.hour=second/60/60;
		}else {
			this.second=second;
		}
	}
	
	
	public String info() {
		String result="";
		result+=String.format("%02d", hour)+":";
		result+=String.format("%02d", minute)+":";
		result+=String.format("%02d", second);
		
		return result;
	}
	
	
}
