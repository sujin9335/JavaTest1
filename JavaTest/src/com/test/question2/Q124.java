package com.test.question2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Q124 {

	public static void main(String[] args) {
		
		
		try {
			String dir1="C:\\class\\dev\\파일_입출력_문제\\검색_회원.dat";
			String dir2="C:\\class\\dev\\파일_입출력_문제\\검색_주문.dat";
			
			Scanner scan = new Scanner(System.in);
			
			BufferedReader reader1=new BufferedReader(new FileReader(dir1));
			BufferedReader reader2=new BufferedReader(new FileReader(dir2));
			
			ArrayList<Person124> ps=new ArrayList<Person124>();
			ArrayList<Order> os=new ArrayList<Order>();
			
			System.out.print("이름: ");
			String name=scan.nextLine();
			
			String line=null;
			
			while((line=reader1.readLine()) != null) {
				Person124 pp=new Person124();
				String[] p=line.split(",");
				pp.setNume(Integer.parseInt(p[0]));
				pp.setName(p[1]);
				pp.setAddr(p[2]);
				ps.add(pp);
//				System.out.println(line);
			}
			
			reader1.close();
			
			while((line=reader2.readLine()) != null) {
				Order or=new Order();
				String[] o=line.split(",");
				or.setOrNume(Integer.parseInt(o[0]));
				or.setProduct(o[1]);
				or.setProdNume(Integer.parseInt(o[2]));
				or.setNume(Integer.parseInt(o[3]));
				os.add(or);
//				System.out.println(line);
			}
			
			reader2.close();
			
			
			System.out.println("==== 구매내역 ====");
			System.out.println("[번호]  [이름]  [상품명]  [개수]      [배송지]");
			ch(name,ps,os);
			
			
//			System.out.println(os.toString());
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("at Q124.main");
			e.printStackTrace();
		}
		
		
		
		
	}

	private static void ch(String name, ArrayList<Person124> ps, ArrayList<Order> os) {
		
		
		
		for(Person124 list : ps) {
			Order re=new Order();
			if(list.getName().equals(name)) {
				re.setNume(list.getNume());
				re.setName(list.getName());
				re.setAddr(list.getAddr());
				
				for(Order list2 : os) {
					if(list2.getNume() == re.getNume()) {
						re.setProduct(list2.getProduct());
						re.setProdNume(list2.getProdNume());
						System.out.printf("%3d    %s    %s    %3d    %s\n"
								,re.getNume(),re.getName(),re.getProduct(),re.getProdNume(),re.getAddr());
					}
				}
				
				
				
				
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
}


class Person124{
	private int nume;
	private String name;
	private String addr;
	public int getNume() {
		return nume;
	}
	public void setNume(int nume) {
		this.nume = nume;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Person124 [nume=" + nume + ", name=" + name + ", addr=" + addr + "]";
	}
	
	
	
	
	
}


class Order extends Person124{
	private int orNume;
	private String product;
	private int prodNume;
	public int getOrNume() {
		return orNume;
	}
	public void setOrNume(int orNume) {
		this.orNume = orNume;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getProdNume() {
		return prodNume;
	}
	public void setProdNume(int prodNume) {
		this.prodNume = prodNume;
	}
	@Override
	public String toString() {
		return "order [orNume=" + orNume + ", product=" + product + ", prodNume=" + prodNume + "]";
	}
	
	
	
	
	
	
}

