package com.test.question2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Stack;

public class Q125 {

	public static void main(String[] args) {
		
		
		try {
			String dir="C:\\class\\dev\\파일_입출력_문제\\괄호.java";
//			String dir="C:\\class\\code\\java\\JavaTest\\src\\com\\test\\question2\\Q111.java";
			
			BufferedReader reader= new BufferedReader(new FileReader(dir));
			
			int code=-1;
			
			Stack<Character> st=new Stack<Character>();
			
			
			while((code=reader.read()) != -1) {
//				System.out.print((char)code);
				if(code == '(' || code == '{') {
					st.push((char)code);
				}
				
				if(st.size() > 0 && (st.peek() == '(' && code == ')')) {
					st.pop();
				}else if(st.size() > 0 && (st.peek() == '{' && code == '}')) {
					st.pop();
				}
			}
			
//			System.out.println(st.peek());
//			System.out.println(st.pop());
			
			if(st.size() == 0) {
				System.out.println("올바른 소스입니다");
			}else {
				System.out.println("올바르지 않은 소스입니다");
			}
			
			System.out.println(st.size());
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("at Q125.main");
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
