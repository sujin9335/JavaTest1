package com.test.question;

import java.util.Scanner;

public class Q005 {

	public static void main(String[] args) {
		
//		요구사항
//		자전거가 있다. 자전거의 바퀴는 지름(직경)이 26인치이다. 사용자가 페달을 밟은 횟수를 입력하면 자전거가 총 몇 m를 달렸는지 출력하시오.
//
//		조건..
//		기어비 1:1 → 페달 1회전 == 자전거 바퀴 1회전
//		모든 출력 숫자는 천단위 표기하시오.

		Scanner scan = new Scanner(System.in);
		System.out.println("사용자가 페달을 밟은 횟수: ");
		int pedal=scan.nextInt();
		double diameter=26*0.0254;
		double result=(double)pedal*diameter*3.14;
		
		System.out.printf("사용자가 총 %d회 페달을 밟아 자전거가 총 %,.3fm를 달렸습니다",pedal,result);
	
	
	}
}





