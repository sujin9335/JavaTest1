package com.test.question.q106;

public class MyStack {

	private String[] stack;
	private int index;
	
	
	public MyStack() {
		this.index=-1;
	}
	
	
	boolean push(String value) {
		try {
			if(index == -1) {
				index++;
				this.stack=new String[1];
				
			}else if(index > -1) {
				index++;
				String[] nStack=new String[index+1]; 
				for(int i=0; i<this.index; i++) {
					nStack[i]=this.stack[i];
				}
				this.stack=nStack;
			}
			this.stack[this.index]=value;
			
			
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public String pop() {
		String result="";
		
		if(this.index == -1) {
			System.out.println("없음");
		}else if(this.index > -1){
			result=this.stack[index];
			this.index--;
		}
		
		return result;
	}
	
	public int size() {
		return this.index+1;
		
	}

	public String peek() {
		String result="";
		if(index > -1) {
			result=this.stack[this.index];		
		}else {
			result="없음";
		}
		return result;
	}
	
	void clear() {
		this.index=-1;
	}
	
	void trimToSize() {
		String[] nStack=new String[this.index+1];
		for(int i=0; i<this.index+1; i++) {
			nStack[i]=this.stack[i];
		}
		this.stack=nStack;
		
		
	}
	
	
	
	
	
}//
