package com.test.java;

public class Student {

	private String name;
	private int kor;
	private int eng;
	private int math;
	
	//private int total;
	//private double avg; 
	
	public int total() {
		return this.kor+this.eng+this.math;
	}
	
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	
	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
