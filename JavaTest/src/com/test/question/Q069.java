package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q069 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int input=0;
		System.out.print("배열 길이: ");
		input=scan.nextInt();
		
		int [] nums=new int[input];
		
		for(int i=0; i<input; i++) {
			nums[i]=(int)(Math.random()*9+1);
		}
		System.out.printf("원본: %s\n",Arrays.toString(nums));
		
		int input2=0;
		
		if(input%2 == 0) {
			input2=input/2;
		}else {
			input2=input/2+1;
		}
//		System.out.println(input);
		
		int [] numsSum=new int[input2];
		
		
		int a=0;
		
		for(int i=0; i<nums.length; i++) {
			numsSum[a]+=nums[i];
			if(i%2 == 1) a++;
		}
		
		System.out.printf("결과: %s\n",Arrays.toString(numsSum));
		
		
		
		
	}
	
	
	
}




