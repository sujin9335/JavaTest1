package com.test.question;

public class Q078 {

	public static void main(String[] args) {
		
		int[][] nums=new int[5][5];
		
		int n=1;
		
		int a=0;
		int b=0;
		
				while(a < 4 || b < 4) {
				
				
					if(a == 0 && b < 4) {
						nums[a][b]=n;
						n++;
						b++;
					}else if(b == 4 && a < 5) {
						nums[a][b]=n;
						n++;
						a++;	
					}
				
				}
				
				while(a > 0 || b > 0) {
				
					if(a == 4 && b > 0 ) {
						nums[a][b]=n;
						n++;
						b--;
					}else if(b == 0 && a > 0) {
						nums[a][b]=n;
						n++;
						a--;	
					}
				}
				
				a++;
				b++;
				
				
				while(a < 3 || b < 3) {
					
					if(a == 1 && b < 3) {
						nums[a][b]=n;
						n++;
						b++;
					}else if(b == 3 && a < 4) {
						nums[a][b]=n;
						n++;
						a++;	
					}
					
				}
				
				while(a > 1 || b > 1) {
					
					if(a == 3 && b > 1 ) {
						nums[a][b]=n;
						n++;
						b--;
					}else if(b == 1 && a > 1) {
						nums[a][b]=n;
						n++;
						a--;	
					}
				}
				
				
				
				
				
				
				
			System.out.println(a+" "+b);
			
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}	
		
		
		
		
		
		
		
		
		
		
		
	}
}
