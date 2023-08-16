package com.test.java;

import java.util.Scanner;

public class Ex30_for {

	
	public static void main(String[] args) {
		
		
//		m1();
//		m2();
//		m3();
//		m4();
		m5();
		
		
		
//		q39(); //예제
//		q41();
		
		//다중 반복문 > 단일 반복문
		
		
		
		
		
	}

	private static void m5() {

		//별찍기(5x5)
		
		int n=1;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				
				System.out.print("*");
//				System.out.printf("%3d",n);
//				n++;
				
			}
			System.out.println();
			
		}
		System.out.println();
		
		
		for(int i=0; i<5; i++) {
			for(int j=i; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		
		
		
		
	}

	private static void q41() {

		
		
		
		
	}

	private static void q39() {

		Scanner scan = new Scanner(System.in);
		
		int begin=0, end=0;
		int sum=0;
		
		System.out.print("시작 숫자: ");
		begin=scan.nextInt();
		System.out.print("종료 숫자: ");
		end=scan.nextInt();
		
		for(int i=begin; i<=end; i++) {
			sum+=i;
//			System.out.printf("%d+ ",i);
			if(i != end) {
				System.out.printf("%d + ",i);
			}else {
				System.out.println(i);
			}
			
			
			
		}
		System.out.println(" = "+sum);
		
		
		
		
		
		
		
	}

	private static void m4() {

		//루프 > 분기문 개입(break, continue)
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				
				//if(i == 5) {
				//if(j == 5) {
				//if(i == 5 && j == 5) {
				if(i == 5 || j == 5) {
					break; //자신이 포함된 제어문을 탈출한다(j루프 탈출)
				}
				
				
				System.out.printf("i: %d, j: %d\n",i,j);
			}
		}
		
		
		
		
		
	}

	private static void m3() {

		//쌍용 교육 센터
		//- 강의실(1강의실 ~ 6강의실)
		//- 학생들(30명)
		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=30; j++) {
				System.out.printf("%d강의실 %d번 학생\n",i,j);
			}
			
		}
		
		
		
		
		
		
	}

	private static void m2() {
		
		//구구단(2단~9단)
		
		for(int j=2; j<=9; j++) {
			
			System.out.println("=======");
			System.out.printf("     %d단\n", j);
			System.out.println("=======");
			
			
			for(int i=1; i<=9; i++) {
				System.out.printf("%d x %d = %2d\n",j,i,j*i);
			}
			System.out.println();
		}
	}

	//K&R 스타일 > Eclips/Intellij 기본 스타일
	public static void test() {
		
		
	}
	
	//Allman 스타일
	public static void test2() 
	{
		
		
	}
	
	
	
	private static void m1() {

		//모든 제어문끼리는 중첩이 가능하다
		
		//중첩된 반복문
		//2중 for문
		
		//루프 변수 > i
		
		// Ctrl + Shift + F(format)
		
//		for(int i=0; i<10; i++) {
//		
//			for(int j=0; j<10; j++) {
//				
//				//System.out.println("실행문");//10회 실행
//				System.out.printf("i: %d: ,j: %d\n",i,j);
//				
//				
//			}
//		}
		
		
		//3중 for문
		for(int i=0; i<24; i++) { //대회전
			for(int j=0; j<60; j++) { //중회전
				for(int k=0; k<60; k++) { //소회전
					
//					System.out.println("실행문");
					System.out.printf("i: %d, j: %d, k: %d\n",i,j,k);
					
				}
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
	}
}





