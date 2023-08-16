package com.test.question.q95;

class Employee {
	private String name;
	private String department;
	private String position;
	private String tel;
	private Employee boss;

	// getter, setter 구현
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		int count=0;
		
		if(2 >= name.length() && name.length() >= 5) count++;	
		for(int i=0; i<name.length(); i++) {
			if('가' > name.charAt(i) || '힣' < name.charAt(i)) count++;
		}
		
		if(count == 0) {
			this.name = name;
		}else {
			msg("한글 2~5자 이내");
		}
		
		
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		if(department.equals("영업부") 
			|| department.equals("기획부")
			|| department.equals("총무부")
			|| department.equals("개발부")
			|| department.equals("홍보부")) {
			this.department = department;
		}else {
			msg("영업부, 기획부, 총무부, 개발부, 홍보부 입력");
		}
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		if(position.equals("부장")
			|| position.equals("과장")
			|| position.equals("대리")
			|| position.equals("사원")) {
			this.position = position;
		}else {
			msg("부장, 과장, 대리, 사원 입력");
		}
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		int count=0;
		//"010-"위치확인
		//"-"제거 > 11자리 확인 > 숫자인지확인
		if(tel.subSequence(0, 4).equals("010-") 
			&& tel.subSequence(8, 9).equals("-")) {
		}else {
			count++;
		}
		
		String num=tel.replace("-", "");
		
		if(num.length() != 11) count++;
		
		for(int i=0; i<num.length(); i++) {
			if('0' > num.charAt(i) && '9' < num.charAt(i)) count++;
		}
		
		
		if(count == 0) {
			this.tel = tel;
		}else {
			msg("010-XXXX-XXXX 형식");
		}
		
		
		
	}


	public void setBoss(Employee boss) {
		if(boss == null) {
		}else {
			this.boss = boss;
		}
		
		
		
		
	}

	public void info() {
		String result="";
		result+=String.format("[%s]\n", this.name);
		result+="- 부서: "+this.department+"\n";
		result+="- 직위: "+this.position+"\n";
		result+="- 연락처: "+this.tel+"\n";
		
		if(boss == null) {
			result+="- 직속상사: 없음";
		}else {
			result+=String.format("- 직속상사: %s(%s %s)\n"
					, this.boss.name
					, this.boss.department
					, this.boss.position);
		}
				
		
		System.out.println(result);
		
		
	}
	
	
	
	public void msg(String msg) {
		String result="";
		result+="===========\n";
		result+=msg+"\n";
		result+="===========\n";
		
		System.out.println(result);
	}
	
	
	
}
