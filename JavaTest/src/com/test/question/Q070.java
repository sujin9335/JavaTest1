package com.test.question;

public class Q070 {

	public static void main(String[] args) {
		
		int[][] nums=new int[5][5];
		
		
		int n=1;
		
		for(int i=0; i<5; i++) {
			if(i%2 == 0) {
				for(int j=0; j<5; j++) {				
					nums[i][j]=n;
					n++;	
				}
				
			}else {
				for(int j=4; j>=0; j--) {
					nums[i][j]=n;
					n++;
				}
				
			}
			
			
			
			
			
		}
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%5d", nums[i][j]);
				
			}
			System.out.println();
		}
		
		
	}
}


//int[][] nums=new int[5][5];
//
//int n=1;
//
//for(int i=0; i<5; i++) {
//	for(int j=0; j<5; j++) {
//		nums[i][j]=n;
//		n++;
//	}
//}
//
//
//for(int i=0; i<5; i++) {
//	for(int j=0; j<5; j++) {
//		System.out.printf("%5d", nums[i][j]);
//	}
//	System.out.println();
//}


//0.0 0.1 0.2 0.3 0.4
//1.0 1.1 1.2 1.3 1.4
//2.0 2.1 2.2 2.3 2.4
//3.0 3.1 3.2 3.3 3.4
//4.0 4.1 4.2 4.3 4.4









