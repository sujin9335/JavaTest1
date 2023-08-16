package com.test.java.data;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		
			성적 관리 프로그램
			
			- 파일
				- "Main.java" > 메인 > 전체 컨트롤
				- "View.java" > 출력 담당
				- "Data.java" > 데이터 담당 > student.txt 담당(입출력)
				- "Student.java" > 학생 1명 정보 > 상자
				- "Service.java" 
				
			- 데이터 파일
				- JavaTest > data > "student.txt"
			
		
		*/
		
		Data.load();
//		System.out.println(Data.list);
		
		Scanner scan = new Scanner(System.in);
		
		boolean loop=true;
		while(loop) {
			View.mainMenu();
			
			String se1=scan.nextLine();
			
			if(se1.equals("1")) {
				Service.add();
			}else if(se1.equals("2")) {
				Service.list();
			}else if(se1.equals("3")) {
				Service.delete();
			}else {
				loop=false;
			}
			
			
		}//while
		
		System.out.println("프로그램 종료");
		
		Data.save();
		
		
		
	}
}










