package com.test.question;

public class Q054 {

	public static void main(String[] args) {
		
		
		String result="";
		
		for(int i=2; i<100; i++) {
			
			int count=0;
			
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					count++;
					break;
				
				}
				
				
			}
			if(count == 0) result+=""+i+", ";
			
		}
		
		System.out.println(result);
	}
	
	
}




