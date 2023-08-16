package com.test.question2;

import java.io.File;

public class Q119_2 {

	public static void main(String[] args) {
		
		File dir=new File("C:\\class\\dev\\파일_디렉토리_문제\\직원");
		
		File[] list=dir.listFiles();
		
		for(File f : list) {
			String[] temp=f.getName().split("_");
			
			String name=temp[0];
			String year=temp[1];
			
			File nameDir=new File(dir.getAbsolutePath()+"\\"+name);
			nameDir.mkdir(); //중복되면 자동으로 안만들어줌 
			
			File yearDir=new File(dir.getAbsolutePath()+"\\"+name+"\\"+year);
			yearDir.mkdir();
			
			File dest=new File(dir.getAbsolutePath()+"\\"+name+"\\"+year+"\\"+f.getName());
			f.renameTo(dest);
			
			
		}
		
		
	}
}
