package com.test.question.q96;

class Box {
	private Macaron[] list=new Macaron[10];
	
	

	public void cook() {
		
		String [] color= {"red", "blue", "yellow", "white", "pink", "purple", "green", "black"};
		
		for(int i=0; i<list.length; i++) {
			this.list[i]=new Macaron();
			this.list[i].setSize((int)(Math.random()*11+5));
			this.list[i].setColor(color[(int)(Math.random()*8)]);
			this.list[i].setThickness((int)(Math.random()*20+1));
		}
		System.out.println("마카롱을 10개 만들었습니다.");
		System.out.println();
		
	}

	public void check() {
		
		int pass=0;
		int fail=0;
		
		for(int i=0; i<list.length; i++) { //합불 판단
			int count=0;
			
			if(8 > this.list[i].getSize() || this.list[i].getSize() > 14) count++;
			if(this.list[i].getColor().equals("black")) count++;
			if(3 > this.list[i].getThickness() || this.list[i].getThickness() > 18) count++;
			
			if(count == 0) {
				pass++;
				this.list[i].setCh("합격");
			}else {
				fail++;
				this.list[i].setCh("불합격");
			}
		
		}
		
		System.out.println("[박스 체크 결과]");
		System.out.printf("QC 합격 개수: %d\n",pass);
		System.out.printf("QC 불합격 개수: %d\n",fail);
		System.out.println();
		
	}

	public void list() {
		
		System.out.println("[마카롱 목록]");
		for(int i=0; i<list.length; i++) {
			System.out.printf("%d번 마카롱: %dcm(%s, %d): %s\n"
					,i+1
					,this.list[i].getSize()
					,this.list[i].getColor()
					,this.list[i].getThickness()
					,this.list[i].getCh());
		}
		System.out.println();
		
	}
	
}//



