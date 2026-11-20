package com.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.service.UserServiceImple;
public class UserController {

	public static void main(String[] args) {

		UserServiceImple usi = new UserServiceImple();
		boolean flag = true;
		while (flag) {

			System.out.println("=================================================");
			System.out.println("                    WELCOME                      |");
			System.out.println("-------------------------------------------------");
			System.out.println("1:          Create User                          |");
			System.out.println("2:          Display User Information             |");
			System.out.println("3:          Update User Information              |");
			System.out.println("4:          Delete User Information              |");
			System.out.println("5:          Exit                                 |");
			System.out.println("==================================================");

			Scanner sc = new Scanner(System.in);
			int ch=0;
			try {
				System.out.println("Enter Choice");
				ch = sc.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("You Enter Wrong Choice Choice is must between 1to5 and Int format");
			}
			
			switch (ch) {
			case 1:
				usi.createUser();
				break;
			case 2:
				usi.displayUserInfo();
				break;
			case 3:
				usi.updateUserInfo();
				break;
			case 4:
				usi.deleteUserInfo();
				break;
			case 5:
				flag = false;
			default:
				System.out.println("you Enter wrong Input");
			}

		}
	}

}
