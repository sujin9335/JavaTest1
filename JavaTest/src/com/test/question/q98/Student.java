package com.test.question.q98;

public class Student {
	
	private String name;
	private int age;
	private int grade;
	private int classNumber;
	private int number;
	
	public Student() {
		this.name="미정";
		this.age=0;
		this.grade=0;
		this.classNumber=0;
		this.number=0;
	}
	
	public Student(String name, int age) {
		this.name=name;
		this.age=age;
		this.grade=0;
		this.classNumber=0;
		this.number=0;
	}
	
	public Student(int grad, int classNumber, int number) {
		this.name="미정";
		this.age=0;
		this.grade=grad;
		this.classNumber=classNumber;
		this.number=number;
		
	}
	
	
	public Student(String name, int age, int grade, int classNumber, int number) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.classNumber = classNumber;
		this.number = number;
	}

	public String info() {
		String result="";
		result+=name;
		result+="(나이: "+(age == 0 ? "미정": age);
		result+=", 학년: "+(grade == 0 ? "미정" : grade);
		result+=", 반: "+(classNumber == 0 ? "미정" : classNumber);
		result+=", 번호: "+(number == 0 ? "미정" : number)+")";
		return result;
	}
	
	
	
}
