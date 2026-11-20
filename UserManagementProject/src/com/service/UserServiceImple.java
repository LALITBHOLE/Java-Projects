package com.service;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.entity.User;
import com.validation.ConstantArray;
import com.validation.Validator;

public class UserServiceImple implements Userservice {

	static Scanner sc = new Scanner(System.in);

	static User user[] = new User[ConstantArray.max_size];

	int limit = 0;

	@Override
	public void createUser() {

		try {
			System.out.println("How Many User You want To create");
			limit = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Enter Wrong Input");
			//System.out.println(e.getMessage());
			System.out.println(e);
		}
		for (int i = 0; i < limit; i++) {

			User u = new User();

			boolean flag = true;
			int id = (int) (Math.random() * Math.pow(10, 4));
			u.setUid(id);
			System.out.println("Your User Id =" + u.getUid());

			while (flag) {
				System.out.println("Enter User Name");
				String name = sc.next();
				if (Validator.validName(name)) {
					u.setUname(name);
					flag = false;
				} else
					System.out.println("You Entered wrong name");
			}

			flag = true;
			while (flag) {
				System.out.println("Enter User Mobile Number");
				String phNo = sc.next();
				if (Validator.validPhonenumber(phNo)) {
					u.setMobileno(phNo);
					flag = false;
				} else
					System.out.println("You Entered wrong name");
			}

			System.out.println("Enter Addresss of User");
			String address = sc.next();
			u.setAddress(address);

			flag = true;
			while (flag) {
				System.out.println("Enter Email");
				sc.nextLine();
				String email = sc.nextLine();
				if (Validator.validEmail(email)) {
					flag = false;
					u.setEmail(email);
				} else
					System.out.println("You Enter Wrong Email");
			}

			flag = true;
			while (flag) {
				System.out.println("Enter Adhar card number");
				String adharNo = sc.nextLine();
				if (Validator.validAdharNumber(adharNo)) {
					flag = false;
					u.setAddharcard(adharNo);
				} else
					System.out.println("You Enter Wrong Adhar Card Number");
			}
			user[i] = u;
			System.out.println("account created successfully");
		}
		
	}

	@Override
	public void displayUserInfo() {
		System.out.println("Enter User Id");
		int userId = sc.nextInt();
		for (int i = 0; i < limit; i++) {
			if (user[i] != null) {
				if (user[i].getUid() == userId) {
					System.out.println(user[i]);
					return;
				}
			}
		}
		System.out.println("Enterd wrong id");
	}

	@Override
	public void updateUserInfo() {
		System.out.println("Enter User Id");
		int userId = sc.nextInt();
		for (int i = 0; i < limit; i++) {
			if (user[i] != null) {
				if (user[i].getUid() == userId) {

					boolean flag = true;
					while (flag) {
						System.out.println("============================");
						System.out.println("1: Update Name");
						System.out.println("2: Update Email");
						System.out.println("3: Update Mobile Number");
						System.out.println("4: Update Address");
						System.out.println("5: Exit...!");

						System.out.println("Enter Choice");
						int ch = sc.nextInt();
						sc.nextLine();

						boolean flag1 = true;
						switch (ch) {
						case 1:
							while (flag1) {
								System.out.println("Enter user Name");
								sc.nextLine();
								String name = sc.nextLine();
								if (Validator.validName(name)) {
									flag1 = false;
									user[i].setUname(name);
									System.out.println("Name Update Successfully");
								} else
									System.out.println("You Enter Wrong name");
							}
							break;
						case 2:
							flag1 = true;
							while (flag1) {
								System.out.println("Enter Email");
								sc.nextLine();
								String email = sc.nextLine();
								if (Validator.validEmail(email)) {
									flag1 = false;
									user[i].setEmail(email);
									System.out.println("Email update Successfully");
								} else
									System.out.println("You Enter Wrong Email");
							}
							break;
						case 3:
							flag1 = true;
							while (flag1) {
								System.out.println("Enter Phone number");
								String phno = sc.next();
								if (Validator.validPhonenumber(phno)) {
									flag1 = false;
									user[i].setMobileno(phno);
									System.out.println("Mobile number Update succesfully");
								} else
									System.out.println("You Enter Wrong Phone Number");
							}
							break;
						case 4:
							System.out.println("Enter Address for Updation");
							sc.nextLine();
							String Address = sc.nextLine();
							user[i].setAddress(Address);
							System.out.println("Address update Successfully");
							break;
						case 5:
							flag = false;
							break;

						default:
							System.out.println("You Enter Wrong Choice For Update");
						}
					}
					return;

				}
			}
		}
		System.out.println("User Does Not exist");
	}

	@Override
	public void deleteUserInfo() {
		System.out.println("Enter UserId Which User You want to Delete");
		int userId = sc.nextInt();
		for (int i = 0; i < limit; i++) {
			if (user[i] != null) {
				if (user[i].getUid() == userId) {
					user[i] = null;
					System.out.println("User Deleted Succesfully");
					return;
				}
			}
		}
		System.out.println("Enter Wrong Id");
	}

}
