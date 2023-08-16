package com.test.question.q105;

public class MyQueue {

	private String[] queue;
	private int index;
	
	public MyQueue() {
		this.index=-1;
	}
	
	
	public boolean add(String value) {
		
		try {
			if(index == -1) {
				index++;
				this.queue=new String[index+1];
			}
			else if(index >= 0) {
				index++;
				String[] nQueue=new String[index+1];
				for(int i=0; i<this.index; i++) {
					nQueue[i]=this.queue[i];
				}
				this.queue=nQueue;
				
			}
			this.queue[this.index]=value;
			return true;
		}catch(Exception e) {
			return false;
		}
		
		
		
		
		
	}
	
	
	public String poll() {
		String result="";
		
		if(index != -1) {
			result=this.queue[0];
			for(int i=0; i<index; i++) {
				this.queue[i]=this.queue[i+1];
			}
			
		}else { //계속 부르면 index값이 -1보다 아래로 떨어짐, 값이없을때 해결방식
			result="값이없음";
			this.index++;
		}
		this.index--;
		return result;
	}
	
	public int size() {
		return this.index+1;
		
	}
	
	public String peek() {
		String result="";
		if(index == -1) {
			result="없음";
			return result;
		}else {
			return this.queue[0];
		}
		
		
	}
	
	public void clear() {
		this.queue=null;
		this.index=-1;
	}
	
	void trimToSize() {
		String[] nQueue=new String[this.index+1];
		for(int i=0; i<this.index+1; i++) {
			nQueue[i]=this.queue[i];
		}
		this.queue=nQueue;
		
		
	}
	
}
