package com.test.question;

public class Q079 {

	public static void main(String[] args) {
		
		int[][] nums=new int[3][3];
		
		int a=1; //0
		int b=2; //3 0
		
		int n=1;
		
		while(n<10) {
			if(a<0) a+=3; //범위 넘어갔을경우 보정
			if(b>2) b-=3;
			if(b<0) b+=3;
			
			if(nums[a][b] == 0) { //값이 없을경우 2시방향 a-1 b+1
				nums[a][b]=n;
				a--;
				b++;
			}else { //값이 있을경우 왼쪽 b-1 > 하지만 다시한번 더 루프를 돌려야되서 n--해줌
				b--;
				n--;
			}
			
			
			n++;
		}
		
		
		
		
		
		
		
		
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
