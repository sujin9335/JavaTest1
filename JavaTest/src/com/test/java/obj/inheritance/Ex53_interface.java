package com.test.java.obj.inheritance;

public class Ex53_interface {

	public static void main(String[] args) {
		
		
		MxKeys keyboard=new MxKeys();
		keyboard.powerOn();
		keyboard.keyDown('A');
		System.out.println(keyboard.checkBatter());
		keyboard.powerOff();
		
		
		
	}
}



//*** keyboard는 객체를 생성할 수 없다. > 실체화할 수 없다. 
interface keyboard{
	
	//키보드로서 갖춰야할 행동들 정의(선언부(O), 구현부(x)) >호출 사용법
	
	void keyDown(char c);//생성제한자 무조건public 사용이라 생략가능 
	void powerOn();
	void powerOff();
	int checkBatter();
	//static void aaa();//static 안됨
	
	
}


class MxKeys implements keyboard {

	@Override
	public void keyDown(char c) {
		//구현? > 자기 맘대로~
		System.out.println(c+"눌렀음");
	}

	@Override
	public void powerOn() {
		System.out.println("전원켜짐");
	}

	@Override
	public void powerOff() {
		System.out.println("전원꺼짐");
	}

	@Override
	public int checkBatter() {
		
		return 80;
	}
	
	
}











