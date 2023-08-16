package com.test.question;

import java.util.Scanner;

public class Q048 {

	public static void main(String[] args) {
//		요구사항
//		최대 9자리 정수를 입력받아 각자리의 홀수 숫자합과 짝수 숫자합을 구하시오.
		Scanner scan = new Scanner(System.in);
		
//		int even=0, odd=0;
//		
//		int num=273645281;
//		
//		for(;;) {
//			
//			if(num%10%2 == 0) {
//				even+=num%10;
//			}else {
//				odd+=num%10;
//			}
//			num/=10;
//			
//			if(num == 0) break;
//			
//		}
//		
//		System.out.printf("짝수의 합: %d\n",even);
//		System.out.printf("홀수의 합: %d\n",odd);
		
		
		
		
//		System.out.println(sum);
		
		int input=0;
		int even=0;
		int odd=0;
		
		int selec=0;
		
		System.out.print("숫자 입력: ");
		input=scan.nextInt();
		
		for(int i=0; i<9; i++) {
			selec=input%10; //1의자리 숫자 구하기
			input=input/10; //1의자리 숫자 뺀 수 대입
			if(selec%2 == 0) {
				even+=selec;
			}else if(selec%2 == 1) {
				odd+=selec;
			}
//			System.out.println(selec);
//			System.out.println(input);
//			System.out.println();
			
			
			
			
		}
		System.out.printf("짝수의 합: %d\n",even);
		System.out.printf("홀수의 합: %d\n",odd);
		
		
	}
	
	
}




