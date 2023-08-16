package com.test.question2;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;

public class Q118 {
	public static ArrayList<Q118_file> al= new ArrayList<Q118_file>();
	public static int a = 0;

	public static void main(String[] args) {

		File dir1 = new File("C:\\class\\dev\\파일_디렉토리_문제\\크기 정렬");

		countFile(dir1);

//		System.out.println(al.toString());
		
		String result="\t\t[파일명]\t\t[크기]\t[파일이 들어있는 폴더]\n";
		
		al.sort(new Comparator<Q118_file>() {
			@Override
			public int compare(Q118_file o1, Q118_file o2) {
				// TODO Auto-generated method stub
				if(o1.getSize() == o2.getSize()) {
					return 0;
				}else if(o1.getSize() > o2.getSize()) {
					return 1;
				}else {
					return -1;
				}
			}
		});
			
		
		for(Q118_file list : al) {
			result+=String.format("%25s %10s\t\t%s\n"
					,list.getName(), ch((int)list.getSize()),list.getDir());
			
		}
		
		System.out.println(result);

	}

	private static void countFile(File dir1) {

		File[] list = dir1.listFiles();
		for (File a : list) {
			if (a.isFile()) {
				Q118_file f = new Q118_file();
				int index = a.getParent().lastIndexOf("\\"); // 파일 경로에서 \ 인덱스 구하기
				f.setName(a.getName());
				f.setSize(a.length());
				f.setDir(a.getParent().substring(index + 1));
				al.add(f);
			}

		}

		for (File b : list) {
			if (b.isDirectory()) {
				countFile(b);
			}
		}

	}
	
	private static String ch(int size) {
		String result="";
		if(size < 1024) {
			result+=String.format("%dB", size);
		}else if(size < 1024*1024) {
			result+=String.format("%dkB", size/1024);
		}else if(size < 1024*1024*1024) {
			result+=String.format("%dfMB", size/1024/1024);
		}else if(size < 1024*1024*1024*1024) {
			result+=String.format("%dfGB", size/1024/1024/1024);
		}else if(size < 1024*1024*1024*1024*1024) {
			result+=String.format("%dfGB", size/1024/1024/1024/1024);
		}
		return result;
	}
	
	

}
