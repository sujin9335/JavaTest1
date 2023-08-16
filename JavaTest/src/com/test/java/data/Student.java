package com.test.java.data;

public class Student {

	private String no;
	private String name;
	private String gradNo;
	private String classNo;
	private String studentNo;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String no, String name, String gradNo, String classNo, String studentNo) {
		super();
		this.no = no;
		this.name = name;
		this.gradNo = gradNo;
		this.classNo = classNo;
		this.studentNo = studentNo;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGradNo() {
		return gradNo;
	}

	public void setGradNo(String gradNo) {
		this.gradNo = gradNo;
	}

	public String getClassNo() {
		return classNo;
	}

	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", gradNo=" + gradNo + ", classNo=" + classNo + ", studentNo="
				+ studentNo + "]";
	}
	
	
	
	
}
