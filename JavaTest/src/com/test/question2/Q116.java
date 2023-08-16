package com.test.question2;

import java.io.File;
import java.util.HashSet;

public class Q116 {

	public static void main(String[] args) {
		
		File dir1=new File("C:\\class\\dev\\파일_디렉토리_문제\\동일 파일\\MusicA");
		File dir2=new File("C:\\class\\dev\\파일_디렉토리_문제\\동일 파일\\MusicB");
		
		if(dir1.exists()&&dir2.exists()) {
			HashSet<String> hs=new HashSet<String>();
			
			
			File[] list1=dir1.listFiles();
			File[] list2=dir2.listFiles();
			
			for(File a : list1) { // dir1 파일 hs에 넣기
				hs.add(a.getName());
			}
//			System.out.println(hs.toString());
			
			for(File b : list2) {
				if(!hs.add(b.getName())) {
					System.out.println(b.getName());
				}
				
			}
			
			
			
			
		}
		
		
		
		
	}
}
