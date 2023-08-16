package com.test.question2;

import java.io.File;

public class Q115 {

	public static void main(String[] args) {

		File dir = new File("C:\\class\\dev\\파일_디렉토리_문제\\파일 제거");
		int count=0;
		
		if (dir.exists()) {
			File[] list = dir.listFiles();

			for (File f : list) {
				
				if (f.length() == 0) {
					f.delete();
					count++;
//					System.out.println(f);

				}
			}

			System.out.printf("총 %d개의 파일을 삭제했습니다",count);
			
			
		}

	}
}
