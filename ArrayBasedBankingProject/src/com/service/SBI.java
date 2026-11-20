package com.service;

import java.io.IOException;
import java.util.Scanner;

import com.model.Account;
import com.model.ConstatntArraySize;
import com.validation.Validator;

public class SBI implements RBI {

	static Scanner sc = new Scanner(System.in);
	static Account[] acc = new Account[ConstatntArraySize.maxSize];
	static Account account = new Account();

	@Override
	public void creatAccount() throws IOException {
		System.out.println("How many Account you want to create");
		int acclimit = sc.nextInt();

		for (int i = 0; i < acclimit; i++) {

			long accNo = (long) (Math.random() * Math.pow(10, 12));
			account.setAccountNo(accNo);

			boolean flag = true;
			while (flag) {
				System.out.println("Enter Account Holder Name");
				sc.nextLine();
				String name = sc.nextLine();
				if (Validator.validName(name)) {
					flag = false;
					account.setAccholderName(name);
				} else
					System.out.println("You Enter Wrong name");
			}

			flag = true;
			while (flag) {
				System.out.println("Enter Email");
				String email = sc.nextLine();
				if (Validator.validEmail(email)) {
					flag = false;
					account.setEmail(email);
				} else
					System.out.println("You Enter Wrong Email");
			}

			flag = true;
			while (flag) {
				System.out.println("Enter Phone number");
				String phno = sc.next();
				if (Validator.validPhonenumber(phno)) {
					flag = false;
					account.setPhNO(phno);
				} else
					System.out.println("You Enter Wrong Phone Number");
			}

			flag = true;
			while (flag) {
				System.out.println("Enter Balance");
				double balance = sc.nextDouble();
				if (balance >= 0) {
					flag = false;
					account.setBalance(balance);
				} else
					System.out.println("You Enter Negative balance");
			}

			System.out.println("Enter Address");
			account.setAddress(sc.next());

			flag = true;
			while (flag) {
				System.out.println("Enter Pan card Number");
				String panNo = sc.next();
				if (Validator.validPanNumber(panNo)) {
					flag = false;
					account.setPanno(panNo);
				} else
					System.out.println("You Enter Wrong Pan Number");
			}
			acc[i] = account;

		}
		System.out.println("Your account creation Limit is Reached");
		System.out.println("Your Limit is =" + acclimit + "Now You enter" + (acclimit + 1));
		System.out.println("Acount Numbers of 1st=" + account.getAccountNo());

	}

	@Override
	public void displayAccoundDetails() {
		boolean flag = true;

		while (flag) {
			System.out.println("---------------------------");
			System.out.println("    Enter Account Number    ");
			System.out.println("----------------------------");
			long accNo = sc.nextLong();
			for (int i = 0; i < acc.length; i++) {
				if (acc[i] != null) {
					if (account.getAccountNo() == accNo) {
						System.out.println(acc[i]);
					}
				} else
					System.out.println("Enter Wrong Account number");
			}
		}

	}

	@Override
	public double displayBalance() {
		boolean flag = true;

		while (flag) {
			System.out.println("---------------------------");
			System.out.println("    Enter Account Number    ");
			System.out.println("----------------------------");
			long accNo = sc.nextLong();
			for (int i = 0; i < acc.length; i++) {
				if (acc[i] != null) {
					if (account.getAccountNo() == accNo) {
						System.out.println(acc[i].getBalance());
					}
				} else
					System.out.println("Enter Wrong Account number");
			}
		}
		return 0;
	}

	@Override
	public double depositeMoney() {
		boolean flag = true;

		while (flag) {
			System.out.println("---------------------------");
			System.out.println("    Enter Account Number    ");
			System.out.println("----------------------------");
			long accNo = sc.nextLong();
			for (int i = 0; i < acc.length; i++) {
				if (acc[i] != null) {
					if (account.getAccountNo() == accNo) {
						System.out.println("Enter Amount for deposite");
						double damount = sc.nextDouble();

						double newbalance = acc[i].getBalance() + damount;
						acc[i].setBalance(newbalance);
					}
				}
				if (acc[i] == null) {
					System.out.println("Wrong account number");
				}
			}
		}
		return 0;
	}

	@Override
	public double withdrawMoney() {
		boolean flag = true;

		while (flag) {
			System.out.println("---------------------------");
			System.out.println("    Enter Account Number    ");
			System.out.println("----------------------------");
			long accNo = sc.nextLong();
			for (int i = 0; i < acc.length; i++) {
				if (acc[i] != null) {
					if (account.getAccountNo() == accNo) {
						System.out.println("Enter Amount for Withdraw");
						double wamount = sc.nextDouble();
						
						if(acc[i].getBalance()>=wamount){
						double newbalance = acc[i].getBalance() -wamount;
						acc[i].setBalance(newbalance);
						System.out.println("Withdraw Successfully...Remaning balance="+newbalance);
						}else
							System.out.println("Insufficient balance");
					}
				}
				if (acc[i] == null) {
					System.out.println("Wrong account number");
				}
			}
		}
		return 0;
	}

	@Override
	public void updateAccountDetails() {
		// TODO Auto-generated method stub

	}

}
