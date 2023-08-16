package com.test.question.q93;

class Note {
	private String size=""; // 크기
	private String color=""; // 색상
	private int page;
	private String owner="";
	private int price;

	// setter, getter 구현

	public String info() {
		String result="";
		if(owner.equals("")) {
			result+="■■■■■■ 노트 정보 ■■■■■■\n";
			result+="주인 없는 노트\n";
			result+="■■■■■■■■■■■■■■■■■■■■■■\n";
		}else {
			result+="■■■■■■ 노트 정보 ■■■■■■\n";
			result+="소유자: "+owner+"\n";
			result+="특성: "+ch()+"\n";
			priceSum();
			result+="가격: "+String.format("%,d", price)+"원\n";			
			result+="■■■■■■■■■■■■■■■■■■■■■■\n";
		}
		
		return result;
	}


	


	public void setSize(String size) {
		if(size.equals("A3") || size.equals("A4") || size.equals("A5") || 
			size.equals("B3") || size.equals("B4") || size.equals("B5")) {
			this.size = size;
		}else {
			System.out.println("A3, A4, A5, B3, B4, B5 중에 입력");
		}
		
	}


	public void setColor(String color) {
		if(color.equals("검정색") || color.equals("흰색") ||color.equals("노란색") ||color.equals("파란색")) {
			this.color = color;
		}else {
			System.out.println("검정색, 흰색, 노란색, 파란색 중에 입력");
		}
		
	}

	public void setPage(int page) {
		if(10 <= page && page <= 200) {
			this.page = page;
		}else {
			System.out.println("10 ~ 200페이지 이내");
		}
	}


	public void setOwner(String owner) {
		int count=0;
		
		for(int i=0; i<owner.length(); i++) {
			if('가' <= owner.charAt(i) && owner.charAt(i) <= '힣') {
			}else {
				count++;
			}
		}
		
		if(2 <= owner.length() && owner.length() <= 5) {
		}else {
			count++;
		}
		
		if(count == 0) {
			this.owner=owner;
		}else {
			System.out.println("소유자 이름은 한글 2~5자이내");
		}
		
		
	}
	public void priceSum() {
		int result=500;
		result+=sizeP()+colorP()+pageP();
		this.price=result;
	}


	private int pageP() {
		int result=0;
		
		if(10 < this.page) {
			result+=this.page%10*10;
			result+=this.page/10*100;
			result+=this.page/100*1000;
		}
		
		
		return result;
	}


	private int colorP() {
		int result=0;
		switch(this.color) {
			case "흰색" : result=0;break;
			case "검정색" : result=100;break;
			case "노란색" : 
			case "파란색" : result=200;break;
			default : break;
		}
		return result;
	}


	private int sizeP() {
		int result=0;
		switch(this.size) {
			case "A5" : result=0;break;
			case "A3" : result=400;break;
			case "A4" : result=200;break;
			case "B3" : result=500;break;
			case "B4" : result=300;break;
			case "B5" : result=100;break;
			default : break;
		}
		return result;
	}

	private String ch() {
		String result="";
		result+=this.color+" ";
		if(this.page <=50) {
			result+="얇은 ";
		}else if(this.page <= 100) {
			result+="보통 ";
		}else if(this.page <= 200) {
			result+="두꺼운 ";
		}
		result+=this.size+"노트";
		
		return result;
	}
	
	
}