package com.qa.demo;

public class ReverseFactorial {

	// 5! NONE
	public static String reverseFactorial(float num) {
		int count = 1;

		while (num > 1) {
			num /= ++count;
			if (num % 1 != 0)
				return "NONE!";
		}

		return count + "!";
	}

}
