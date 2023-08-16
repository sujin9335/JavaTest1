package com.test.question;

import java.util.Scanner;

public class Q044 {

	public static void main(String[] args) {
		
//		요구사항
//		숫자를 N개 입력받아 아래와 같이 출력하시오.
//
//		조건..
//		누적값이 100을 넘어가는 순간 루프를 종료하시오.
//		짝수는 더하고 홀수는 빼시오.
		Scanner scan = new Scanner(System.in);
		
		int input=0;
		int sum=0;
		String sumS="";
	
		
		for(int i=1; ;i++) {
			System.out.print("숫자: ");
			input=scan.nextInt();
			
			
			if(input%2 == 0) {
				sum+=input;
				sumS+="+ "+input+" ";
			}else {
				sum-=input;
				sumS+="- "+input+" ";
			}
			
			if(sum > 100) {
				break;
			}
			
//			System.out.println(sum);
//			System.out.println(sumS);
			
		}
		
		
		System.out.printf("%s = %d",sumS,sum);
		
	}
	
}
