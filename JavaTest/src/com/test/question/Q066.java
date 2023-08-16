package com.test.question;

import java.util.Arrays;

public class Q066 {

	public static void main(String[] args) {
		
		int[] lott=new int[6];
		
		for(int i=0; i<lott.length; i++) {
			lott[i]=(int)(Math.random()*45+1);
			for(int j=0; j<i; j++) {
				if(lott[i] == lott[j]) i=i-1;
			}
		}
		Arrays.sort(lott);
		System.out.println(Arrays.toString(lott));
	}
}




