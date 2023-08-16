package com.test.question;

import java.util.Scanner;

public class Q085 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String jumin="";
		
		
		System.out.print("주민등록번호: ");
		jumin=scan.nextLine();
		
		jumin=jumin.replace("-", "");
		
		System.out.println();
		
		int year=Integer.parseInt(jumin.substring(0,2));
		int month=Integer.parseInt(jumin.substring(2,4));
		int day=Integer.parseInt(jumin.substring(4,6));
		char gender=jumin.charAt(6);
		int last=jumin.charAt(jumin.length()-1)-48;		
		
		
		System.out.println(month);
		
		
		
		int a=0;
		
		
		if(jumin.length() != 13) a++; 
			
		if(1 > month || month > 12) a++; 
			
		if(dayCh(month,day)) a++; 
			
		if(genderCh(year,gender)) a++;
		
		if(lastCh(jumin, last)) a++;
			
		
		if(a == 0) { 
			System.out.println("올바른 주민등록번호입니다.");
		}else {
			System.out.println("올바르지 않은 주민등록번호입니다.");
		}
			
		
		
		
		
		
	}

	private static boolean lastCh(String jumin, int last) {
		boolean result=false;
		int sum=0;
		int[] a= {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
		
		for(int i=0; i<jumin.length()-1; i++) {
			sum+=(jumin.charAt(i)-48)*a[i];
		}
		
		int total=11-sum%11;
		
		if(total == 11) { 
			total=1;
		}else if(total == 10) {
			total=0;
		}
		
		
		result=(total == last ? false : true); 
		
		return result;
	}

	private static boolean genderCh(int year, char gender) { // 남녀 귀화 구분
		if(gender == '1' || gender == '2' || gender == '3'  || gender == '4' 
				|| gender == '5'  || gender == '0'  || gender == '5'  || gender == '6' ) return false;
		return true;
	}
//12 30
	private static boolean dayCh(int month, int day) { // if 간결하게 쓰기위해 참 거짓 반대 (윤년은 계산안함)
		
		if(day != 0) {
			switch(month) {
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 : month=31; break;
			case 4 :
			case 6 :
			case 9 :
			case 11 : month=30; break;
			case 2 : month=28; break;
			
			}
			
			if(day <= month) {
				return false;
			}else {
				return true;
			}
			
		}else {
			return true;
		}
		
		
		
	}
}
