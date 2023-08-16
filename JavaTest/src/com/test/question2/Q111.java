package com.test.question2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Q111 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String dir="";
		String input="";
		
//		dir="C:\\class\\dev\\eclipse";
//		input="exe";
		
		System.out.print("폴더: ");
		dir=scan.nextLine();
		System.out.print("확장자: ");
		input=scan.nextLine();
		
		
		File f=new File(dir);
		
		if(f.exists()) {
			
			ArrayList<String> rs=new ArrayList<String>();
			
			File[] list=f.listFiles();
			
//			for(File fs : list) {
//				if(fs.isFile()) {
//					String st=fs.toString(); //각 파일명을 String 으로 저장
//					if(st.substring(st.lastIndexOf(".")+1).equals(input)) {// .을 기준으로 확장자 같은지
//						rs.add(st.substring(st.lastIndexOf("\\")+1)); // /을 기준으로 뒤에 다 rs에 저장
//					}
//				}
//			}
//			for(String s : rs) {
//				System.out.println(s);
//			}
			
			
			
			for(File fs : list) {
				if(fs.isFile()) {
					String st=fs.getName(); //각 파일명을 String 으로 저장
					if(st.endsWith(input)) {// endsWith 끝에가 같은 값으로 끝나는지
						System.out.println(fs.getName());
					}
				}
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
	}
}
