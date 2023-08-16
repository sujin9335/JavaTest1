package com.test.question;

import java.util.Arrays;

public class Q064 {

	public static void main(String[] args) {
		
		int[] nums=new int[20];
		
		String result="원본: ";
		
		for(int i=0; i<nums.length; i++) {
			int ran=(int)(Math.random()*20+1);
			nums[i]=ran;
			result+=nums[i]+", ";
			
		}
//		
//		System.out.println(Arrays.toString(nums));
		System.out.println(result);
		
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i] > nums[i+1]) {
				int temp=nums[i];
				nums[i]=nums[i+1];
				nums[i+1]=temp;
			}
		}
		System.out.printf("최댓값: %d\n", nums[nums.length-1]);
		
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i] < nums[i+1]) {
				int temp=nums[i];
				nums[i]=nums[i+1];
				nums[i+1]=temp;
			}
		}
		System.out.printf("최솟값: %d\n", nums[nums.length-1]);
		
		
		
		
		
		
	}
	
	
	
}
