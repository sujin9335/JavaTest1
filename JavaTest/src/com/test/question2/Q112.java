package com.test.question2;

import java.io.File;
import java.util.Scanner;

public class Q112 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		File f1=new File("C:\\class\\code\\java\\file\\AAA\\test.txt");
		File f2=new File("C:\\class\\code\\java\\file\\BBB\\test.txt");
		
		
		if(f1.exists()) {
			if(!f2.exists()) {
				f1.renameTo(f2);
				System.out.println("파일 이동 완료");
			}else {
				
				System.out.print("같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n)");
				char input=scan.nextLine().charAt(0);
				if(input == 'n') {
					System.out.println("n. 작업을 취소합니다.");
				}else if(input == 'y') {
					f2.delete();
					f1.renameTo(f2);
					System.out.println("y. 파일을 덮어썼습니다.");
				}
				
				
				
			}
			
			
			
			
			
		}else {
			
			try {
				f1.createNewFile();
			}catch(Exception e) {
				System.out.println("파일생성됨");
			}
		}
		
		
		
		
	}
	
}
