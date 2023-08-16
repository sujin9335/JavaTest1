package com.test.java.calendar;

public class Item {

	private String seq;
	private String data;
	private String title;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(String seq, String data, String title) {
		super();
		this.seq = seq;
		this.data = data;
		this.title = title;
	}

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Item [seq=" + seq + ", data=" + data + ", title=" + title + "]";
	}
	
	
	
	
	
	
}
