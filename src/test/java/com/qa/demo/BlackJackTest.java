package com.qa.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BlackJackTest {

	@Test
	void testP1Wins() {
		assertEquals(18, BlackJack.play(18, 14));
	}

	@Test
	void testP2Wins() {
		assertEquals(17, BlackJack.play(14, 17));
	}

//
	@Test
	void testDraw() {
		assertEquals(16, BlackJack.play(16, 16));
	}

	@Test
	void testP1Bust() {
		assertEquals(18, BlackJack.play(27, 18));
	}

	@Test
	void testP2Bust() {
		assertEquals(19, BlackJack.play(19, 26));
	}

	@Test
	void testBothBust() {
		assertEquals(0, BlackJack.play(26, 29));
	}

}
