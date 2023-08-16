package com.test.question.q97;

class Refrigerator {
	private Item[] items = new Item[100];
	private int count2=0;
	
	public void add(Item item) {
		
//		this.items[count2]=new Item();
		this.items[count2]=item;
		System.out.printf("%s를 냉장고에 넣었습니다 \n"
							,this.items[count2].getName());
		count2++;
	}

	public Item get(String name) {
		Item result=null;
		int chI=0;
		for(int i=0; i<count2; i++) {
			if(this.items[i].getName().equals(name)) {
				result=this.items[i];
				this.items[i]=this.items[i+1];
				chI=i;
				count2--;
				break;
			}
		}
		
		if(result != null) {
			for(int i=chI; i<count2; i++) {
				items[i]=items[i+1];
			}
		}
		
		
		
		return result;
	}

	public int count() {
		int result=count2;
		return result;
	}

	public void listItem() {
		System.out.println("[냉장고 아이템 목록]");
		for(int i=0; i<count2; i++) {
			System.out.printf("%s(%s)\n"
					,this.items[i].getName()
					,this.items[i].getExpiration());
			
		}
		
	}
}
