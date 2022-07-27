package com.qa.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DemoTest {

	@Test
	void test() {
		assertEquals(5, Demo.add(2, 2));
	}

}
