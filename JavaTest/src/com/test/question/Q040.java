package com.test.question;

import java.util.Scanner;

public class Q040 {

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
//		1 - 2 + 3 - 4 + 5 - 6 + 7 - 8 + 9 - 10 = -5
		Scanner scan = new Scanner(System.in);
		
		int startNum=0;
		int endNum=0;
		int sum=0;
		int count=1;
		
		System.out.print("시작 숫자: ");
		startNum=scan.nextInt();
		System.out.print("종료 숫자: ");
		endNum=scan.nextInt();
		
		for(int i=startNum; i<=endNum; i++) {
			
			if(startNum <= i && i < endNum) { //시작수 ~ 끝수-1 
				if(count%2 == 1) { // 홀수 숫자는 + count 사용하여 계산
					count++;
					sum+=i;
					System.out.printf("%d - ",i);
				}else if(count%2 == 0) { // 짝수 숫자는 - count 사용하여 계산 
					count++;
					sum-=i;
					System.out.printf("%d + ",i);
				}
			}else if(i == endNum) { //끝수
				if(count%2 == 1) { //끝수가 count를 보고 홀수인지 짝수인지 판별하여 계산
					sum+=i;
				}else if(count%2 == 0) {
					sum-=i;
				}
				System.out.printf("%d = %d",endNum,sum); // 끝수와 총합 출력
			}
			
		}
		
		
		
//		System.out.println(sum);
		
	}
}




