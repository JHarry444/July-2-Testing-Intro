package com.qa.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseFactorialTest {

	@Test
	void testOne() {
		assertEquals("1!", ReverseFactorial.reverseFactorial(1));
	}

	@Test
	void testTwo() {
		assertEquals("2!", ReverseFactorial.reverseFactorial(2));
	}

	@Test
	void testThree() {
		assertEquals("3!", ReverseFactorial.reverseFactorial(6));
	}

	@Test
	void testFour() {
		assertEquals("4!", ReverseFactorial.reverseFactorial(24));
	}

	@Test
	void testFive() {
		assertEquals("5!", ReverseFactorial.reverseFactorial(120));
	}

	@Test
	void testNone() {
		assertEquals("NONE!", ReverseFactorial.reverseFactorial(99));

	}
}
