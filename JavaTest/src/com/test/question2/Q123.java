package com.test.question2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Q123 {

	public static void main(String[] args) {
		
		
		try {
			String f="C:\\class\\dev\\파일_입출력_문제\\단일검색.dat";
			
			Scanner scan = new Scanner(System.in);
			
			BufferedReader reader=new BufferedReader(new FileReader(f));
			
			ArrayList<Person> ps=new ArrayList<Person>();
			
			String line=null;
			
			while((line=reader.readLine()) != null) {
				Person p=new Person();
				String[] pi=line.split(",");
				p.setNum(Integer.parseInt(pi[0]));
				p.setName(pi[1]);
				p.setAddr(pi[2]);
				p.setPhone(pi[3].trim());
				ps.add(p);
			}
			reader.close();
			
			System.out.print("이름: ");
			String name=scan.nextLine();
			
			for(Person p : ps) {
				if(p.getName().equals(name)) {
					System.out.println("["+name+"]");
					System.out.printf("번호: %d\n",p.getNum());
					System.out.printf("주소: %s\n",p.getAddr());
					System.out.printf("전화: %s\n",p.getPhone());
				}
			}
			
			
			
			
		} catch (Exception e) {
			System.out.println("at Q123.main");
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}


class Person{
	
	private int num;
	private String name;
	private String addr;
	private String phone;
	
	public Person() {
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [num=" + num + ", name=" + name + ", addr=" + addr + ", phone=" + phone + "]";
	}
	
	
	
}


