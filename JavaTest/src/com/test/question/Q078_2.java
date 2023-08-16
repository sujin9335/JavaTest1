package com.test.question;

public class Q078_2 {

	public static void main(String[] args) {
		
		int[][] nums=new int[5][5];
		
		int n=1;
		
		
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[0].length; j++) {
//				nums[0][j]=n;
//				nums[i][4]=n;
//				n++;
				
				
				
				if(i == 0 && j < 4) {
					nums[i][j]=n;
					n++;
				}else if(j == 4 && i < 5) {
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






