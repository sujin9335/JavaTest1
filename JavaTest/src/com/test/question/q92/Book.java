package com.test.question.q92;

//Ctrl + shift + F > 위치 정리
class Book {
	private String title;
	private int price;
	private String author;
	private String publisher;
	private String pubYear = "2019";
	private String isbn;
	private int page;

	public String info() {
		String result="";
		
		result+="제목: "+title+"\n";
		result+="가격: "+String.format("%,d", price)+"원\n";
		result+="저자: "+author+"\n";
		result+="출판사: "+publisher+"\n";
		result+="발행년도: "+pubYear+"년\n";
		result+="ISBN: "+isbn+"\n";
		result+="페이지: "+String.format("%,d", page)+"장\n";
		
		return result;
	}

	
	// getter, setter
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if(title.length() < 50) {
			this.title = title;
		}else {
			System.out.println("제목 최대 50자 이내");
		}
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(0 < price && price <=1000000) {
			this.price = price;
		}else {
			System.out.println("가격 오류, 0 ~ 1000000원");
		}
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	
	
	public String getPubYear() {
		return pubYear;
	}


	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		if(0 < page) {
			this.page = page;
		}else {
			System.out.println("페이지 수 0 이하 입니다");
		}
	}
}




