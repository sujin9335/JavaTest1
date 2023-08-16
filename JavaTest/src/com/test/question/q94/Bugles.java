package com.test.question.q94;

import java.util.Calendar;

class Bugles {
	private int price;
	private int weight;
	private Calendar creationTime;
	private int expiration;

	// getter, setter 구현

	public void eat() {
		if(0 <= expiration) {
			System.out.println("과자를 맛있게 먹겠습니다");
		}else {
			System.out.println("유통기한이 지나 먹을 수 없습니다");
		}
	}

	public int getPrice() {
		
		return price;
	}


	public void setSize(int weight) {
		if(weight == 300 || weight == 500 || weight == 850) {
			this.weight = weight;
			setPriceEx(weight);
		}else {
			System.out.println("용량(g) 300, 500, 850 입력");
		}
	}

	private void setPriceEx(int weight) {
		if(weight == 300) {
			this.price=850; this.expiration=7;
		}
		if(weight == 500) {
			this.price=1200; this.expiration=10;
		}
		if(weight == 850) {
			this.price=1950; this.expiration=15;
		}
		
	}

	public Calendar getCreationTime() {
		return creationTime;
	}
	
	
	

	public void setCreationTime(String creationTime) {
		Calendar ct = Calendar.getInstance();
		String[] ymd=creationTime.split("-");
		int[] ymdI=new int[ymd.length];
		for(int i=0; i<ymd.length; i++) {
			ymdI[i]=Integer.parseInt(ymd[i]);
		}
		ct.set(ymdI[0],ymdI[1]-1,ymdI[2]);
		this.creationTime = ct;
		setExpiration();
	}

	private void setExpiration() {
		Calendar now = Calendar.getInstance();
		int result=0;
		result=this.expiration-(int)(now.getTimeInMillis()-this.creationTime.getTimeInMillis())/1000/60/60/24;
		
		
		this.expiration=result;
		
	}

	public int getExpiration() {
		return expiration;
	}

}