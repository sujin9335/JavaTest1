package com.test.question.q104;

public class MyArrayList {

	private String[] list;
	private int index; //*******************중요함
	
	public MyArrayList() {
		this.index=0;
	}
	
	public boolean add(String value) {
		
		
		try {
			if(this.index == 0) { // || if(this.list == null) {
				this.list=new String[4];
			}else if(this.index == this.list.length-1) {
				ch();
				
//				String[] nList=new String[this.list.length*2];
//				for(int i=0; i<this.list.length; i++) {
//					nList[i]=this.list[i];
//				}
//				this.list=nList;
			}
				
			
			
			//배열의 방이 남아 있는지? > 있으면..
			//					> 없으면.. > 두배로 늘리기!!
			
			this.list[this.index]=value;
			this.index++;
			
			return true;
		}catch(Exception e) {
			return false;
		}
		
		
	}
	
	
	public String get(int index) {
		return this.list[index];
	}
	
	public int size() {
		return this.index;		
	}
	
	public String set(int index, String value) {
		String result="";
		result=this.list[index];
		this.list[index]=value;
		return result;
	}
	
	public String remove(int index) {
		String result="";
		result=this.list[index];
		for(int i=index; i<this.index; i++) {
			this.list[i]=this.list[i+1];
		}
		this.index--;
		
		return result;
	}
	
	public boolean add(int index, String value) {
		
		if(this.index == this.list.length-1) {
			ch();
			
//			String[] nList=new String[this.list.length*2];
//			for(int i=0; i<this.list.length; i++) {
//				nList[i]=this.list[i];
//			}
//			this.list=nList;
		}
		
		for(int i=this.index; i>=index; i--) {
			this.list[i+1]=this.list[i];
		}
		this.list[index]=value;
		this.index++;
		
		return false;
	}
	
	public int indexOf(String value) {
		int result=-1;
		for(int i=0; i<this.index; i++) {
			if(this.list[i].equals(value)) {
				result=i;
				break;
			}
		}
		
		return result;
	}
	
	
	public void clear() {
		this.list=null;
		index=0;
	}
	
	public void trimToSize() {
		String[] nList=new String[this.index+1];
		for(int i=0; i<nList.length; i++) {
			nList[i]=this.list[i];
		}
		this.list=nList;
		
	}
	
	public void ch() {
		String[] nList=new String[this.list.length*2];
		for(int i=0; i<this.list.length; i++) {
			nList[i]=this.list[i];
		}
		this.list=nList;
	}
	
}
