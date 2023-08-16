package com.test.question2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Q121 {

	public static void main(String[] args) {
		
		String dir1="C:\\class\\dev\\파일_입출력_문제\\숫자.dat";
		String dir2="C:\\class\\dev\\파일_입출력_문제\\숫자_변환.dat";
		
		try {
			BufferedReader reader=new BufferedReader(new FileReader(dir1));
			BufferedWriter writer=new BufferedWriter(new FileWriter(dir2,true));
			
			int code=-1;
			String result="";
			
			while((code=reader.read()) != -1) {
				writer.write(ch((char)code));
			}
			
			System.out.println(result);

			
			writer.close();
			reader.close();
			
			
			
		} catch (Exception e) {
			System.out.println("at Q121.main");
			e.printStackTrace();
		}
		
		
		
		
	}

	private static char ch(char code) {
		char result=code;
		switch(code) {
			case '0' : result='영';break;
			case '1' : result='일';break;
			case '2' : result='이';break;
			case '3' : result='삼';break;
			case '4' : result='사';break;
			case '5' : result='오';break;
			case '6' : result='육';break;
			case '7' : result='칠';break;
			case '8' : result='팔';break;
			case '9' : result='구';break;
		}
		return result;
	}
}
