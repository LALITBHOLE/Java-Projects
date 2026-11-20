package com.model;

public class Account {

	private long accountNo;
	private String accholderName;
	private String email;
	private String phNO;
	private String adharNo;
	private String panno;
	private double balance;
	private String address;
	
	public long generateAcoountNumber() {
		long accountNoGenerate=(long)(Math.random()*Math.pow(10, 12));
		return accountNoGenerate;
		
	}
	
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccholderName() {
		return accholderName;
	}
	public void setAccholderName(String accholderName) {
		this.accholderName = accholderName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhNO() {
		return phNO;
	}
	public void setPhNO(String phNO) {
		this.phNO = phNO;
	}
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	public String getPanno() {
		return panno;
	}
	public void setPanno(String panno) {
		this.panno = panno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accholderName=" + accholderName + ", email=" + email + ", phNO="
				+ phNO + ", adharNo=" + adharNo + ", panno=" + panno + ", balance=" + balance + ", address=" + address
				+ "]";
	}
	
	
}
