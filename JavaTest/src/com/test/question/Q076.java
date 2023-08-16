package com.test.question;

import java.util.Scanner;

public class Q076 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] score = new String[10][3];
		int kor=0;
		int eng=0;
		int math=0;
		
		System.out.print("국어 점수: ");
		kor=scan.nextInt();
		System.out.print("영어 점수: ");
		eng=scan.nextInt();
		System.out.print("수학 점수: ");
		math=scan.nextInt();
		

		for(int i=0; i<10; i++) {
			for(int j=0; j<3; j++) {
				score[i][j]=" ";
			}
		}
		
		for(int i=9; i>=10-(kor/10); i--) {//점수 체크 > 점수랑 가로줄 값 0 
			score[i][0]=" ■ ";
		}
		for(int i=9; i>=10-(eng/10); i--) {
			score[i][1]=" ■ ";
		}
		for(int i=9; i>=10-(math/10); i--) {
			score[i][2]=" ■ ";
		}
		
		
		
		
		
		
		
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<3; j++) {
				System.out.printf("%s  ", score[i][j]);
			}
			System.out.println();
		}
		System.out.println("-------------");
		System.out.println("국어  영어  수학");
		
		
		
		
	}

//	private static String[][] check(int kor, int num) {
//		String[][] score = new String[10][3];
//		
//		for(int i=9; i>=10-(kor/10); i--) {
//		score[i][num]="■  ";
//		}
//			
//		
//		return score;
//	}
}





