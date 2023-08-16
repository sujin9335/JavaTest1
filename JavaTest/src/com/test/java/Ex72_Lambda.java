package com.test.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Ex72_Lambda {

	public static void main(String[] args) {
		
		/*
		
			람다식, Lambda Expression
			- 함수형 프로그래밍 > 지원
			- 자바 > 람다식 > 컬렉션 조작(= 스트림)
			- 람다식을 사용하면 코드가 간결해진다
			- 자바의 메소드 > 다른(간결한) 표현
			- 람다식은 매개변수를 가지는 코드블럭 (=메소드)
			- 자바의 람다식은 인터페이스를 사용해서 만든다.(자바만의 특징)
			
			
			
			
			람다식 형식
			- 인터페이스 변수 = 람다식;
			- ex) MyInterface m1=() -> {};
			
			- 자바의 메소드의 다른 표현
			- (매개변수) -> {실행코드}
			- a. (매개변수) : 메소드의 매개변수 리스트와 동일
			- b. -> : 화살표(Arrow), 코드블럭 호출역할
			- c. {실행코드}: 메소드의 구현부와 동일
			
		
		*/
		
//		m1();
//		m2();
		m3();
		
		
	}//

	private static void m3() {

		//1. 파일 읽기
		try {
			BufferedReader reader
				=new BufferedReader(new FileReader
						("C:\\class\\dev\\파일_입출력_문제\\성적.dat"));
			
			ArrayList<Student1> list=new ArrayList<Student1>();
			
			
			String line=null;
			
			while ((line=reader.readLine()) != null) {
				
				//텍스트 1줄 > Student 객체 1개
				//홍길동,47,61,73
				
				String[] temp=line.split(",");
				Student1 s=new Student1(
									temp[0]
									,Integer.parseInt(temp[1]) 
									,Integer.parseInt(temp[2]) 
									,Integer.parseInt(temp[3]));						
				list.add(s);
				
			}
			
			reader.close();
			
//			System.out.println(list);
			
			//성적순 > 정렬
			list.sort(new Comparator<Student1>() {

				@Override
				public int compare(Student1 o1, Student1 o2) {
					// TODO Auto-generated method stub
					return o2.getTotal() - o1.getTotal();
				}
				
			});
			
			
			for(Student1 s : list) {
				System.out.println(s.getName()+":"+s.getTotal());
			}
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("at Ex72_Lambda.m3");
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

	private static void m2() {
		
		//람다식 활용 == 익명 클래스(객체) 활용
		
		//Math.random() //0~1 > 실수 난수
		
		Random rnd=new Random();
		
		System.out.println(rnd.nextInt(10)); //0~9
		
		ArrayList<Integer> nums=new ArrayList<Integer>();
		
		for(int i=0; i<10; i++) {
			nums.add(rnd.nextInt(10)+1);
		}
		
		System.out.println(nums);
		
		nums.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {

				return o1-o2;
			}
		});
		
		System.out.println(nums);
		
		nums.sort((Integer o1, Integer o2)->{
			return o1-o2;
		});
		
		nums.sort((o1, o2)->o2 - o1);
		System.out.println(nums);
		
		
		
		
	}

	private static void m1() {
		//요구사항] MyInterface를 구현한 객체를 1개 만드시오
		MyInterface m1=new MyClass();
		m1.test();
		
		MyInterface m2=new MyInterface() {
			
			@Override
			public void test() {
				System.out.println("익명 클래스에서 구현한 메소드");
			}
		};
		
		m2.test();
		
	
		MyInterface m3=() -> {
			System.out.println("람다식에서 구현한 메소드");
		};
		m3.test();
		
		
		
		
		NoParameterNoReturn pr1 = new NoParameterNoReturn() {
			
			@Override
			public void call() {
				System.out.println("pr1");
			}
		};
		
		NoParameterNoReturn pr2=() -> {
			System.out.println("pr2");
		};
		pr2.call();
		
		//*** 실행블럭에 문장이 1개면 {} 생략 가능
		NoParameterNoReturn pr3=() -> System.out.println("pr3");
		
		ParameterNoReturn pr4=(int num) -> {
			System.out.println(num);
		};
		pr4.call(100);
		pr4.call(200);
		pr4.call(300);
		
		
		//*** 매개변수의 자료형을 생략할 수 있다
		ParameterNoReturn pr5=(num) -> System.out.println(num);
		pr5.call(400);
		pr5.call(500);
		
		//*** 매개변수의  ()를 생략할 수 있다
		ParameterNoReturn pr6=num -> System.out.println(num);
		pr6.call(600);
		pr6.call(700);
		
		
		MultiParameterNoReturn pr7=(String name, int age)->{
			System.out.println(name+", "+age);
		};
		pr7.call("홍길동", 20);
		
		//*** 매개변수의 소괄호는 매개변수가 1개일때만 생략할 수 있다
		MultiParameterNoReturn pr8=(name,age)->System.out.println(name+", "+age);
		pr8.call("아무개", 25);
		
		
		NoParameterReturn pr9=()->{
			return 100;
		};
		System.out.println(pr9.call());
		
		//-(리턴값이 있는경우 {} 지우면 return 쓴것도 지워야됨
		NoParameterReturn pr10=()-> 100;
		System.out.println(pr10.call());
		
		
		ParameterReturn pr11=name -> name.length();
		System.out.println(pr11.call("홍길동"));
		System.out.println(pr11.call("남궁길동"));
	}
}


interface MyInterface{
	void test();
}

class MyClass implements MyInterface{

	@Override
	public void test() {
		System.out.println("실명 클래스에서 구현한 메소드");
		
	}
	
}


interface NoParameterNoReturn{
	void call();
}

interface ParameterNoReturn{
	void call(int num);
}

interface MultiParameterNoReturn{
	void call(String name, int age);
}

interface NoParameterReturn{
	int call();
}

interface ParameterReturn{
	int call(String name);
}

class Student1{
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student1() {
		// TODO Auto-generated constructor stub
	}

	public Student1(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getTotal() {
		return this.kor+this.eng+this.math;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "Student1 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	
	
	
	
	
}



