package com.test.java.dummy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class Ex75 {

	public static void main(String[] args) {
		
		
		
		/*
		
		프로그램 제작 > 데이터
		 1. 테스트용 데이터 > 10%
		  - 진짜 데이터
		  - 사람이 직접 기입
		  
		 2. 더미 데이터 > 90%
		  - 양만 채우는 용도
		  - 프로그램으로 작성
		  
		 게시판
		  - "게시판입니다." x 200개
		  
		  회원 가입 + 목록
		  a. javaTest > data > "member.txt"
		  b. 1,홍길동,20,010-1234-4567,서울시 강남구 역삼동 > 규칙
		  c. 데이터 생성
		
		*/
		
		Random rnd=new Random();
		
		String[] name1= {"김","이","박","최","정","현","길","조","신","하"};
		
		String[] name2= {"진","민","인","지","명","정","재","석","길","동","현","훈","원","혜"};

		String[] address1= {"서울시", "부산시", "대전시", "광주시", "제주시"};
		String[] address2= {"강동구", "강남구", "강서구", "강북구", "중구"};
		String[] address3= {"역삼동","대치동","압구정동","천호동","방배동"};
		
		
		try {
			BufferedWriter writer
			=new BufferedWriter(new FileWriter("data\\member.txt"));
		
		
		
		for(int i=0; i<100; i++) {
			//회원 번호
			int no=i+1;
			
			//회원명
			String name=name1[rnd.nextInt(name1.length)] 
					+ name2[rnd.nextInt(name2.length)]
					+ name2[rnd.nextInt(name2.length)];
//			System.out.println(name);
			
			//나이(20~60)
			int age=rnd.nextInt(41)+20;
			
			//연락처
			String tel="010-"
						+(rnd.nextInt(9000)+1000)
						+"-"
						+(rnd.nextInt(9000)+1000);
//			System.out.println(tel);
			
			//주소
			String address=address1[rnd.nextInt(address1.length)]
						+" "
						+address2[rnd.nextInt(address2.length)]
						+" "
						+address3[rnd.nextInt(address3.length)]
						+" "
						+(rnd.nextInt(100)+20)
						+"번지";
//			System.out.println(address);
			
			writer.write(String.format("%d,%s,%d,%s,%s\r\n"
										,no
										,name
										,age
										,tel
										,address));
			
			
			
		}
		
		
		writer.close();
		
		System.out.println("데이터완");
			
			
			
		} catch (Exception e) {
			System.out.println("at Ex75.main");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
}








