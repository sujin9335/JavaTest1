package com.test.question2;

import java.io.File;
import java.util.Scanner;

public class Q110 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String dir="";
		
		
		System.out.print("파일명: ");
		dir=scan.nextLine();
		
		
		File f=new File(dir);
		
		if(f.exists()) { //파일 없으면 test.txt 생성
			String result="";
			String name=f.getName();
			double size=(double)f.length();
			
			int dot=name.lastIndexOf(".");
			
			
			String front=name.substring(0, dot);
			String end=name.substring(dot+1);
			
			result+=String.format("파일명: %s\n", name);
			result+=String.format("종류: %s 파일\n", end);
			result+=String.format("파일 크기: %s\n", ch(size));
			
			System.out.println(result);
			
		}
		
		
		
	}

	private static String ch(double size) {
		String result="";
		if(size < 1024) {
			result+=String.format("%.1fB", size);
		}else if(size < 1024*1024) {
			result+=String.format("%.1fkB", size/1024);
		}else if(size < 1024*1024*1024) {
			result+=String.format("%.1fMB", size/1024/1024);
		}else if(size < 1024*1024*1024*1024) {
			result+=String.format("%.1fGB", size/1024/1024/1024);
		}else if(size < 1024*1024*1024*1024*1024) {
			result+=String.format("%.1fGB", size/1024/1024/1024/1024);
		}
		return result;
	}
	
	
	
	
}
