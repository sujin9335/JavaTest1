package com.test.question2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Q126 {

	public static void main(String[] args) {
		
		
		try {
			String dir="C:\\class\\dev\\파일_입출력_문제\\출결.dat";
			
			BufferedReader reader= new BufferedReader(new FileReader(dir));
			
			ArrayList<Ch> ch=new ArrayList<Ch>();
			
			String line=null;
			
			while((line=reader.readLine()) != null) {
				Ch c=new Ch();
				String[] p=line.split(",");
				c.setName(p[1]);
				c.setSw(Integer.parseInt(p[2].split(":")[0]));
				c.setEw(Integer.parseInt(p[3].split(":")[0]));
				ch.add(c);
			}
			
			
			reader.close();
			
			
			HashMap<String,Integer> ji=new HashMap<String,Integer>();
			HashMap<String,Integer> jo=new HashMap<String,Integer>();
			HashSet<String> name=new HashSet<String>();
			
			for(int i=0; i<ch.size(); i++) {
				if(ch.get(i).getSw() >= 9 && !ji.containsKey(ch.get(i).getName())){
					ji.put(ch.get(i).getName(), 0);
					name.add(ch.get(i).getName());
					int count=0;
//					System.out.println(ch.get(i).getName());
					for(int j=i; j<ch.size(); j++) {
						if(ch.get(j).getSw() >= 9 && ch.get(i).getName().equals(ch.get(j).getName())) {
							count++;
//							System.out.println(ch.get(j)+" "+ch.indexOf(ch.get(j)));
						}
					}
					ji.put(ch.get(i).getName(), count);
				}
			}
			
			
			for(int i=0; i<ch.size(); i++) {
				if(ch.get(i).getEw() < 18 && !jo.containsKey(ch.get(i).getName())){
					jo.put(ch.get(i).getName(), 0);
					name.add(ch.get(i).getName());
					int count2=0;
//					System.out.println(ch.get(i).getName());
					for(int j=i; j<ch.size(); j++) {
						if(ch.get(j).getEw() < 18 && ch.get(i).getName().equals(ch.get(j).getName())) {
							count2++;
							System.out.println(ch.get(j)+" "+ch.indexOf(ch.get(j)));
						}
					}
					jo.put(ch.get(i).getName(), count2);
				}
			}
			
			
//			System.out.println(ji.toString());
//			System.out.println(jo.toString());
			
			System.out.println("[이름]\t[지각]\t[조퇴]");
			
//			for()
			String result=String.format("%s\t%d\td", args);
			
			
			
			System.out.println();
			
			
			
		} catch (Exception e) {
			System.out.println("at Q125.main");
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
}

class Ch{
	private String name;
	private int sw;
	private int ew;
	
	public Ch() {
		// TODO Auto-generated constructor stub
	}

	public Ch(String name, int sw, int ew) {
		this.name = name;
		this.sw = sw;
		this.ew = ew;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSw() {
		return sw;
	}

	public void setSw(int sw) {
		this.sw = sw;
	}

	public int getEw() {
		return ew;
	}

	public void setEw(int ew) {
		this.ew = ew;
	}

	@Override
	public String toString() {
		return "Ch [name=" + name + ", sw=" + sw + ", ew=" + ew + "]";
	}
	
	


	
	
	
	
	
	
	
}





