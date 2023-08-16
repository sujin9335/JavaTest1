package com.test.question;

import java.util.Scanner;

public class Q083 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] input=new String[10];
		
		String mp="mp3";
		String jp="jpg";
		String ja="java";
		String hw="hwp";
		String doc="doc";
		
		int mpN=0;
		int jpN=0;
		int jaN=0;
		int hwN=0;
		int docN=0;
		
		
		
		
		String ch="";
		
		for(int i=0; i<input.length; i++) { //파일명 입력받기
			System.out.print("파일명: ");
			input[i]=scan.nextLine();
		}
		
		for(int i=0; i<input.length; i++) { 
			ch=input[i].substring(input[i].lastIndexOf(".")+1); //각배열에 저장된 확장자추출
//			System.out.println(ch); //파일확장명 체크용
			if(ch.equals(mp)) mpN++; //각 확장자 비교 카운트
			if(ch.equals(jp)) jpN++; 
			if(ch.equals(ja)) jaN++; 
			if(ch.equals(hw)) hwN++; 
			if(ch.equals(doc)) docN++; 
			
			
		}
		
		System.out.println("mp3: "+mpN+"개");
		System.out.println("jpg: "+jpN+"개");
		System.out.println("java: "+jaN+"개");
		System.out.println("hwp: "+hwN+"개");
		System.out.println("doc: "+docN+"개");
		
		
		
		
	}
}










