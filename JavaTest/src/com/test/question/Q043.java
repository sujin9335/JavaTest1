package com.test.question;

import java.util.Scanner;

public class Q043 {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int random=(int)(Math.random()*10)+1;
		int input=0;
		int count=1;
		
		System.out.println(random);
		
		for(int i=0; i<10; i++) {
			
			System.out.print("숫자: ");
			input=scan.nextInt();
			
			if(random == input) {
				System.out.println("맞았습니다");
				System.out.println();
				System.out.printf("컴퓨터가 생각한 숫자는 %d 입니다\n", random);
				System.out.printf("정답을 맞추는데 시도한 횟수는 %d회입니다\n", i+1);
				System.out.println("프로그램을 종료합니다");
				break;
			}else {
				count++;
				System.out.println("틀렸습니다");
				
			}
		}
		if(count == 11) {
			System.out.printf("컴퓨터가 생각한 숫자는 %d 입니다\n", random);
			System.out.println("모든 기회를 실패했습니다");
			System.out.println("프로그램을 종료합니다");
		}
	}
}




