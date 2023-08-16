package com.test.question;

import java.util.Scanner;

public class Q013 {
	public static void main(String[] args) {
//		요구사항
//		국어, 영어, 수학 점수를 전달하면 '합격' 혹은 '불합격'이라는 단어를 반환하는 메소드를 선언하시오.
//
//		조건..
//		String test(int kor, int eng, int math)
//		평균 점수 60점 이상은 '합격'이다.
//		평균 점수 60점 미만은 '불합격'이다.
//		과락: 한 과목 이상 40점 미만이면 불합격이다.
	
		Scanner scan = new Scanner(System.in);
		int kor; // 점수 변수를 먼저 선언 해준다
		int eng;
		int math;
		
		
		System.out.print("국어: ");
		kor=scan.nextInt();
		System.out.print("영어: ");
		eng=scan.nextInt();
		System.out.print("수학: ");
		math=scan.nextInt();
		
		String result = test(kor, eng, math);
		
		System.out.printf(result);
		
	}
	
	public static String test(int kor, int eng, int math) {
		String result;
		
		int avr=(kor+eng+math)/3;
		
		result = (40 <= kor)&&(40 <= eng)&&(40 <= math) ? 
				(60<=avr ? "합격입니다" : "불합격") : "불합격입니다";  
		
		//먼저 평균을 잡아놓고 40점 미만인지 확인하는 방법으로 풀수도 있다
		
		return result ; 
		
	}
	
}




