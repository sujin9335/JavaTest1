package com.test.question2;

import java.io.FileReader;
import java.io.FileWriter;

public class Q120 {

	public static void main(String[] args) {
		
		try {
			//C:\class\dev\파일_입출력_문제\이름수정.dat
			
			FileReader reader=new FileReader("C:\\class\\dev\\파일_입출력_문제\\이름수정.dat");
			
			
			int code=-1;
			String result="";
			
			
			while((code=reader.read()) != -1) {
				result+=(char)code;
			}
//			System.out.println(result);
			
			reader.close();
			
			result=result.replace("유재석", "메뚜기");
			
			
			FileWriter writer=new FileWriter("C:\\class\\dev\\파일_입출력_문제\\이름수정_변환.dat",true);
			
			for(int i=0; i<result.length(); i++) {
				writer.write(result.charAt(i));
			}
			
			writer.close();
			
			System.out.println("변환 후 다른 이름으로 저장하였습니다");
			
		} catch (Exception e) {
			System.out.println("at Q120.main");
			e.printStackTrace();
		}
		
		
		
		
	}
}
