package com.validation;

import java.util.regex.Pattern;

public class Validator {

	public static boolean validName(String name) {

		return Pattern.matches("[a-zA-Z]+( [a-zA-Z]+)*", name);
	}

	public static boolean validPhonenumber(String phno) {
		return Pattern.matches("^[6-9][0-9]{9}$", phno);
	}

	public static boolean validEmail(String email) {
		return Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$", email);
	}

	public static boolean validAdharNumber(String adharNo) {
		return Pattern.matches("^[2-9][0-9]{3} [0-9]{4} [0-9]{4}", adharNo);

	}
}
