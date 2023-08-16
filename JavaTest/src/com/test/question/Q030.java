package com.test.question;

import java.util.Scanner;

public class Q030 {

	public static void main(String[] args) {
		
//		요구사항
//		영문자 1개를 입력받아 대/소문자 변환을 한 뒤 출력하시오.
//
//		조건..
//		유효성 검사를 하시오.(영문자만 입력 가능)
		
		Scanner scan = new Scanner(System.in);
		
		char input;
		
		System.out.print("문자: ");
		input=scan.next().charAt(0);
		
		if(65<=input && input<=90 || 97<=input && input<=122) {
			if(65<=input && input<=90) {
				System.out.printf("\'%c\'의 소문자는 \'%c\'입니다",input,input+32);
			}else if(97<=input && input<=122) {
				System.out.printf("\'%c\'의 대문자는 \'%c\'입니다",input,input-32);
			}
			
		}else {
			System.out.println("영문자만 입력하시오");
		}
		
		
		
		
	}
}






