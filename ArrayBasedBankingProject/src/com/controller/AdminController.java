package com.controller;

import java.io.IOException;
import java.util.Scanner;

import com.files.FileOperation;
import com.model.Account;
import com.service.SBI;


public class AdminController {

	static Scanner sc = new Scanner(System.in);
	static SBI sbi=new SBI();
	static FileOperation fo=new FileOperation();

	public static void main(String[] args) throws IOException {
		
		boolean flag = true;
		while (flag) {
			
			System.out.println("=================================================");
			System.out.println("                    WELCOME                      |");
			System.out.println("-------------------------------------------------");
			System.out.println("1:          Create Account                       |");
			System.out.println("2:          Display Account Details              |");
			System.out.println("3:          Display Balance                      |");
			System.out.println("4:          Deposite Money                       |");
			System.out.println("5           Withdraw Money                       |");
			System.out.println("6:          Update Accounts Details              |");
			System.out.println("7:          Show File Information                |");
			System.out.println("6:          Backup File Creation                 |");
			System.out.println("9:          Delete File                          |");
			System.out.println("10:          Exit                                |");
			System.out.println("==================================================");
			
			int ch=sc.nextInt();
			switch(ch) {
			
				case 1:
					sbi.creatAccount();
					break;
				case 2:
					sbi.displayAccoundDetails();
					break;
				case 3:
					double balance=sbi.displayBalance();
					System.out.println(balance);
					break;
				case 4:
					//System.out.println("Privious balance="+.getBalance());
//					System.out.println("Balance after Deposite");
					double finalbalance=sbi.depositeMoney();
					System.out.println(finalbalance);
					
				
				case 5:
					System.out.println("Enter Amount for withdraw");
					double wamount =sc.nextDouble();
					double remaningbalance=sbi.withdrawMoney();
					System.out.println("Withdraw successfully of Rupees "+wamount);
					System.out.println("Remaning balance="+remaningbalance);
					
				case 6:
					sbi.updateAccountDetails();
					
				case 7:
					fo.getFileInfo();
			}
			

		}

	}

}
