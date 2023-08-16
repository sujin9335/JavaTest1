package com.test.question;

import java.util.Scanner;

public class Q039 {

	public static void main(String[] args) {
//		요구사항
//		아래와 같이 출력하시오.
//
//		입력..
//		시작 숫자: 1 
//
//		종료 숫자: 10 
//
//		출력..
//		1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
		
		Scanner scan = new Scanner(System.in);
		
		int startNum=0;
		int endNum=0;
		int sum=0;
		
		System.out.print("시작 숫자: ");
		startNum=scan.nextInt();
		System.out.print("종료 숫자: ");
		endNum=scan.nextInt();
		
		for(int i=startNum; i<=endNum; i++) {
			sum+=i;
			
			if(startNum<=i && i < endNum) { // 시작수 ~ 끝수-1 까지
				System.out.printf("%d + ",i);
			}else if(i == endNum) { // 끝수 표시
				System.out.printf("%d = %d",i,sum);
			}
			
			
			
		}
		
		
		
		
		
	}
	
	
}





