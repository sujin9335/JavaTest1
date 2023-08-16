package com.project.erpsystem.vo;

public class PayVo {

	int no;
	String name;
	String employeeNo;
	int totalPay;
	int basicPay;
	int allowance; //수당
	int deduction; //공제
	
	public PayVo() {
		// TODO Auto-generated constructor stub
	}

	public PayVo(int no, String name, String employeeNo, int totalPay, int basicPay, int allowance, int deduction) {
		super();
		this.no = no;
		this.name = name;
		this.employeeNo = employeeNo;
		this.totalPay = totalPay;
		this.basicPay = basicPay;
		this.allowance = allowance;
		this.deduction = deduction;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public int getTotalPay() {
		return totalPay;
	}

	public void setTotalPay(int totalPay) {
		this.totalPay = totalPay;
	}

	public int getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(int basicPay) {
		this.basicPay = basicPay;
	}

	public int getAllowance() {
		return allowance;
	}

	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}

	public int getDeduction() {
		return deduction;
	}

	public void setDeduction(int deduction) {
		this.deduction = deduction;
	}

	@Override
	public String toString() {
		return "PayVo [no=" + no + ", name=" + name + ", employeeNo=" + employeeNo + ", totalPay=" + totalPay
				+ ", basicPay=" + basicPay + ", allowance=" + allowance + ", deduction=" + deduction + "]";
	}
	
	
	
	
}
