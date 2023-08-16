package com.test.question;

import java.util.Scanner;

public class Q038 {

	public static void main(String[] args) {
//		요구사항
//		입력 횟수(N)와 숫자 N개를 입력받아 짝수의 합과 홀수의 합을 각각 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		int inputCount=0;
		int inputNum=0;
		
		int even=0;//짝수
		int odd=0;//홀수
		int evenCount=0;//짝수
		int oddCount=0;//홀수
		
		System.out.print("입력 횟수: ");
		inputCount=scan.nextInt();
		
		
		
		for(int i=0; i<inputCount; i++) {
			System.out.print("숫자: ");
			inputNum=scan.nextInt();
			if(inputNum%2 == 0) {
				evenCount++;
				even+=inputNum;
			}else if(inputNum%2 == 1){
				oddCount++;
				odd+=inputNum;
			}
		}
		
		System.out.printf("짝수 %d개의 합: %d\n", evenCount, even);
		System.out.printf("홀수 %d개의 합: %d\n", oddCount, odd);
		
		
		
		
		
	}
}






