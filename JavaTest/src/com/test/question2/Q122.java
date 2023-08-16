package com.test.question2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Q122 {

	public static void main(String[] args) {
		
		String dir="C:\\class\\dev\\파일_입출력_문제\\성적.dat";
		
		try {
			BufferedReader reader=new BufferedReader(new FileReader(dir));
			
			ArrayList<String> pass=new ArrayList<String>();
			ArrayList<String> fail=new ArrayList<String>();
			
			;
			String line=null;
			
			while((line=reader.readLine()) != null ) {
//				System.out.println(line);
				String[] scors=line.split(",");
				
				ch(scors, pass, fail);
				
			}
			reader.close();
			
			System.out.println("[합격자]");
			for(String list : pass) {
				System.out.println(list);
			}
			
			System.out.println();
			System.out.println("[불합격자]");
			for(String list : fail) {
				System.out.println(list);
			}
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("at Q122.main");
			e.printStackTrace();
		}
		
		
	}

	private static void ch(String[] scors, ArrayList<String> pass, ArrayList<String> fail) {
		if(Integer.parseInt(scors[1]) < 40 
				|| Integer.parseInt(scors[2]) < 40
				|| Integer.parseInt(scors[3]) < 40) {
			fail.add(scors[0]);
		}else {
			if((Integer.parseInt(scors[1])+Integer.parseInt(scors[2])+Integer.parseInt(scors[3]))/3 > 60 ) {
				pass.add(scors[0]);
			}
		}
		
	}
}
