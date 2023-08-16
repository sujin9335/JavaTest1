package com.test.question.q101;

public class Latte extends Espresso{

	private int milk;
	
	public void drink() {
		System.out.printf("원두 %dg, 우유 %dml으로 만들어진 라테를 마십니다\n",this.getBean(),this.milk);
	}

	public int getMilk() {
		return milk;
	}

	public void setMilk(int milk) {
		this.milk = milk;
	}

	
	
	
}
