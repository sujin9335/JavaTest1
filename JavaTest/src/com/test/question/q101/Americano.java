package com.test.question.q101;

public class Americano extends Espresso{

	private int water;
	private int ice;

	public void drink() {
		System.out.printf("원두 %dg, 물 %dml, 얼음 %d개로 만들어진 아메리카노를 마십니다\n"
						,this.getBean(),this.water,this.ice);
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public int getIce() {
		return ice;
	}

	public void setIce(int ice) {
		this.ice = ice;
	}

	
	
	
}
