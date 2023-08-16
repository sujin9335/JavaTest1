package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q068 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int del=0;
		int[] nums=new int[10];
		
		System.out.print("삭제 위치: ");
		del=scan.nextInt();
		
		nums=input();
		
		System.out.printf("원본: %s\n",Arrays.toString(nums));
		
		for(int i=del; i<nums.length-1; i++) {
			nums[i]=nums[i+1];
		}
		nums[9]=0;
		System.out.printf("결과: %s\n",Arrays.toString(nums));
		
		
	}

	private static int[] input() {
//		int[] nums= {5, 6, 1, 3, 2, 0, 0, 0, 0, 0};
		int[] nums= {5, 6, 1, 3, 2, 8, 7, 4, 10, 9};
		return nums;
		
		
		
	}
}
