package com.test.question;

public class Q075 {

	public static void main(String[] args) {
		int[][] nums=new int[5][5];
		
		int n=1;
		int[] sumx0=new int[5];
		int sum=0;
		
		for(int i=0; i<5; i++) {
			int sum0x=0; // 가로(x.4) 합친값 -가로 한줄돌면 0으로 초기화
			
			
			for(int j=0; j<5; j++) {
				if(i != 4) sumx0[j]+=n;
				
				
				
				if(j == 4) { //가로(x.4) 나왔을때 sum0x를 출력
					nums[i][4]=sum0x;
					
				}else if(i == 4){ //세로(4.0) 나왔을때 출력
					nums[4][j]=sumx0[j];
					
					
				}else { // x.3까지 n++; 출력
					nums[i][j]=n;
					sum0x+=n;
					sum+=n;
					n++;
				
				}
				
				
				
			}//2for
			
			
			
		}//1for
		nums[4][4]=sum;
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
	}
}
