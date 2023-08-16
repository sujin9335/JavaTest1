package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q067 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] nums1= {5, 6, 1, 3, 2, 0, 0, 0, 0, 0};
		int[] nums2= {5, 6, 1, 3, 2, 8, 7, 4, 10, 9};
		
		int inde=0;
		int num=0;
		
		System.out.print("삽입 위치: ");
		inde=scan.nextInt();
		System.out.print("값: ");
		num=scan.nextInt();
		
		System.out.printf("원본: %s\n",Arrays.toString(nums2));
		
		for(int i=nums2.length-1; i>inde; i--) {
			nums2[i]=nums2[i-1];
		}
		nums2[inde]=num;
		
		
		System.out.printf("결과: %s\n",Arrays.toString(nums2));
		
		
		
		
	}
}




