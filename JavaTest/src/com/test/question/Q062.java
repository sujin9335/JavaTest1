package com.test.question;

import java.util.Scanner;

public class Q062 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수: ");
		int num=scan.nextInt();
		
		String[] names=new String[num];
		
		scan.nextLine();
		for(int i=0; i<num; i++) {
			System.out.print("학생명: ");
			names[i]=scan.nextLine();
			
		}
		
		System.out.printf("입력한 학생은 총 %d명입니다\n",num);
		for(int i=0; i<num; i++) {
			System.out.printf("%d. %s\n",i+1,names[i]);
			
			
		}
		
		
		
	}
}





