package com.test.question;

public class Q077 {

	public static void main(String[] args) {
		
//		0.0 
//		0.1 1.0  
//		0.2 1.1 2.0
//		0.3 1.2 2.1 3.0
//		0.4 1.3 2.1 3.1 4.0
//		값이 대입되는 순서 > 
		
//		1.4/ 2.3/ 3.2 /4.1 
//		2.4/ 3.3/ 4.2/ 
//		3.4/4.3 
//		4.4 
		
		
		
		
		
		int[][] nums=new int[5][5];
		
		int n=1;
		
		int b=0;// 1 
		int c=0;
		
		for(int i=0; i<5; i++) {
			int a=0;
			c=b;
			for(int j=0; j<=b; j++) { //1
				nums[a][c]=n;
				n++;
				a++;
				c--;
			}
			b++;
		}
		
		//d부터 사용
		
		int f=4;
		int g=1;
		
		for(int i=0; i<5; i++) {
			int e=4;
			int d=g;
			for(int j=0; j<f; j++) { //1
				nums[d][e]=n;
				e--;
				d++;
				n++;
			}
			f--;
			g++;
		}
		
		
		nums[2][2]=n;
		
		
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
		
		
		
		
	}
}





