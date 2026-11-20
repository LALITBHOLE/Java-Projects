package com.service;

import java.io.IOException;

import com.model.Account;

public interface RBI {
	
	
	public void creatAccount() throws IOException;
	
	public void displayAccoundDetails();
	
	public double displayBalance();
	
	public double depositeMoney();
	
	public double withdrawMoney();
	
	public void updateAccountDetails();
	

}
