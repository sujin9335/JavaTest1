package com.test.question;

import java.util.Scanner;

public class Q026 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int score;
		
		System.out.print("점수: ");
		score=scan.nextInt();
		
		
		
		if(0<=score && score<=100) {
			if(90<=score) {
				System.out.printf("입력한 %d점은 성적 A입니다\n",score);
			}else if(80<=score) {
				System.out.printf("입력한 %d점은 성적 B입니다\n",score);
			}else if(70<=score) {
				System.out.printf("입력한 %d점은 성적 C입니다\n",score);
			}else if(60<=score) {
				System.out.printf("입력한 %d점은 성적 D입니다\n",score);
			}else if(0<=score) {
				System.out.printf("입력한 %d점은 성적 F입니다\n",score);
			}
			
		}else {
			System.out.println("점수가 올바르지 않습니다. 0~100사이의 값을 입력하시오.");
		}
		
		
		
		
	}
}
