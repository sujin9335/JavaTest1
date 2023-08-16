package com.test.question;

import java.util.Scanner;

public class Q065 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int max=0;
		int min=0;
		
		System.out.print("최대 범위: ");
		max=scan.nextInt();
		System.out.print("최소 범위: ");
		min=scan.nextInt();
		
		String result="원본: ";
		
		
		int[] nums=new int[20];
		for(int i=0; i<nums.length; i++) {
			nums[i]=(int)(Math.random()*20+1);
			result+=nums[i]+", ";
		}
		System.out.println(result);
		
		String result2="결과: ";
		for(int i=0; i<nums.length; i++) {
			if(min<=nums[i] && nums[i]<=max) result2+=nums[i]+", "; 
		}
		System.out.println(result2);
		
		
	}
}




