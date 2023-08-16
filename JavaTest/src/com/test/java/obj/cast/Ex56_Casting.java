package com.test.java.obj.cast;

public class Ex56_Casting {

	public static void main(String[] args) {
		
		//프린터 기기
		//- LG500
		//- HP600
		
//		LG500 lg=new LG500();
//		HP600 hp=new HP600();
//		
//		lg.on();
//		hp.powerOn();
//		
//		lg.print();
//		hp.printing();
//		
//		lg.off();
//		hp.powerOff();
		
		
		LG500 lg=new LG500();
		HP600 hp=new HP600();
		
		lg.powerOn();
		hp.powerOn();
		
		lg.print();
		hp.print();
		
		lg.powerOff();
		hp.powerOff();
		
		
		
		Printer p1;
		LG500 lg2=new LG500();
		
		
		//Printer=LG500;
		//부모=자식
		//업캐스팅
		p1=lg2;
		
		Printer p2=new HP600();
		
		Object o1=new LG500();
		
		
		((HP600)p2).clean(); //-( .이먼저여서 앞에 괄호를 씌워 캐스팅먼저 실행)
		
		
		//상황] 프린터 판매 대리점 운영
		//	- 재고
		//		- LG500 x 5대
		//		- HP600 x 3대
		//	- 매일 업무
		//		- 프린터가 제대로 동작 > 기능 확인
		
		
		//추가상황] LG500 x 500대, HP600 x 300대 -(m1식으로하면 힘들다) m2
		//추가상황] BenQ700, Epson800 > 추가 브랜드(제품)
		
//		m1();
//		m2();
		m3();
		
		
		
	}

	private static void m3() {
		
		Printer[] ps=new Printer[8];
		
		//*** 서로 다른 클래스의 객체를 하나의 배열에 넣기!!!
		ps[0]=new LG500();
		ps[1]=new HP600();
		
		for(int i=0; i<ps.length; i++) {
			if(i<5) {
				ps[i]=new LG500();
			}else {
				ps[i]=new HP600();
			}
		}
		
		
		//업무
		for(int i=0; i<ps.length; i++) {
			ps[i].print();
			
			//추가 업무 -(인터페이스에 영향 받지 않는 메소드 실행)
			//- LG500 > selfTest()
			//- HP600 > clean()
			
			//ps[i].?
			
			//System.out.println(ps[i] instanceof LG500);
			
			
			
			
			if(ps[i] instanceof LG500) {
				((LG500)ps[i]).selfTest();
			}else if(ps[i] instanceof HP600){
				((HP600)ps[i]).clean();
			}
			
			
			
			
			
		}
		
		
		
		
	}

	private static void m2() {

		LG500[] lg=new LG500[5];
		for(int i=0; i<lg.length; i++) {
			lg[i]=new LG500();
		}
		
		HP600[] hp=new HP600[3];
		for(int i=0; i<hp.length; i++) {
			hp[i]=new HP600();
		}
		
		
		//업무
		for(int i=0; i<lg.length; i++) {
			lg[i].print();
		}
		
		for(int i=0; i<hp.length; i++) {
			hp[i].print();
		}
		
		
		
		
		
		
	}

	private static void m1() {
		
		//가장 단순한 방법, 비효율적인 방법
		
		LG500 lg1=new LG500();
		LG500 lg2=new LG500();
		LG500 lg3=new LG500();
		LG500 lg4=new LG500();
		LG500 lg5=new LG500();

		HP600 hp1=new HP600();
		HP600 hp2=new HP600();
		HP600 hp3=new HP600();
		
		
		//업무
		lg1.print();
		lg2.print();
		lg3.print();
		lg4.print();
		lg5.print();
		
		hp1.print();
		hp2.print();
		hp3.print();
		
		
		
	}
}


interface Printer{
	void print();
	void powerOn();
	void powerOff();
	
}









class LG500 implements Printer{
	
	private String type;
	private int price;
	
	public void print() {
		System.out.printf("%s 방식으로 출력합니다.\n", this.type);
	}
	
//	public void on() {
//		System.out.println("프린타 전원을 켭니다");
//	}
//	
//	public void off() {
//		System.out.println("프린타 전원을 끕니다");
//	}
//	
//	public void selfTest() {
//		System.out.println("자가 점검을 합니다");
//	}

	@Override
	public void powerOn() {
		System.out.println("프린타 전원을 켭니다");
	}

	@Override
	public void powerOff() {
		System.out.println("프린타 전원을 끕니다");
	}
	
	public void selfTest() {
		System.out.println("자가점검");
	}
	
	
	
	
}

class HP600 implements Printer{
	private String color;
	private int price;
	
	public void printing() {
		System.out.println("출력 합니다");
	}
	
	public void powerOn() {
		System.out.println("전원 켜짐");
	}
	
	public void powerOff() {
		System.out.println("전원 꺼짐");
		
	}

	@Override
	public void print() {
		System.out.println("출력 합니다");
	}
	
	public void clean() {
		System.out.println("자동점검");
	}
	
}





