package com.test.question;

import java.util.Scanner;

public class Q014 {

	public static void main(String[] args) {
		
//		요구사항
//		지하철 탑승 소요 시간을 구하시오. 지나가는 역의 개수, 환승역의 횟수, 시간대를 전달 받아 총 걸리는 시간을 반환하는 메소드를 선언하시오.
//
//		조건..
//		int getTime(int station, int change, int time)
//		각 역간 소요 시간: 2분 소요
//		환승 소요 시간: N분 소요
//		시간대에 따라 환승 소요 시간이 다르다.
//		평상시: 3분
//		출근시: 4분
//		퇴근시: 5분
		
		Scanner scan = new Scanner(System.in);
		int station; //변수를 먼저 생성 하는게 좋다
		int change;
		int time;
		
		System.out.print("역의 개수: ");
		station=scan.nextInt();
		System.out.print("환승역의 횟수: ");
		change=scan.nextInt();
		System.out.print("시간대(1.평상시, 2.출근시, 3.퇴근시): ");
		time=scan.nextInt();
		
		int result=getTime(station, change, time);
		
		System.out.printf("총 소요 시간은 %d분 입니다.", result);
		
	}
	
	public static int getTime(int station, int change, int time) {
		int result;
		int avr=3;
		int moWork=4;
		int niWork=5;
		
		result=time == 1 ? (station*2)+(change*avr) : 
						(time == 2 ? (station*2)+(change*moWork) : (station*2)+(change*niWork));
						
		//시간대 입력시에 1,2,3 이 아닌 다른값을 넣을수 있기 때문에 그점을 고려해서 코드를 짜는게 좋다 
		
		return result;
	}
}
