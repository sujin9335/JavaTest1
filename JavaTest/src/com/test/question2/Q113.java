package com.test.question2;

import java.io.File;
import java.util.ArrayList;

public class Q113 {

	public static void main(String[] args) {
		
		File f=new File("C:\\class\\dev\\파일_디렉토리_문제\\음악 파일\\Music");
		
		if(f.exists()) {
			
			int count=1;
			File[] fs=f.listFiles();
			
			ArrayList<File> nf=new ArrayList<File>();
			
			for(File a : fs) { //.mp3파일 모두 nf list 에 넣기
				if(a.isFile()) {
					if(a.getName().endsWith(".mp3")) { //
						nf.add(a);
					}
				}
			}
			
			for(File b : nf) { // 
				String newName=String.format("C:\\class\\dev\\파일_디렉토리_문제\\음악 파일\\Music"
						+ "\\[%03d]%s",count,b.getName());
				File re=new File(newName);
				b.renameTo(re);
				count++;;
				System.out.println(re.getName());
				
			}
		}
	}
}
