package com.qa.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DoggoCompetitionTest {

	@Test
	void testSize() {
		assertEquals(99, DoggoCompetition.getPlaces(44).size());
	}

	@Test
	void testDoesNotContain() {
		assertFalse(DoggoCompetition.getPlaces(33).contains("33rd"));
	}

	@Test
	void testFirst() {
		assertTrue(DoggoCompetition.getPlaces(42).contains("21st"));
	}

	@Test
	void testSecond() {
		assertTrue(DoggoCompetition.getPlaces(21).contains("32nd"));
	}

	@Test
	void testThird() {
		assertTrue(DoggoCompetition.getPlaces(21).contains("43rd"));
	}

	@Test
	void testFourth() {
		assertTrue(DoggoCompetition.getPlaces(21).contains("54th"));
	}

	@Test
	void testEleven() {
		assertTrue(DoggoCompetition.getPlaces(21).contains("11th"));
	}

	@Test
	void testTwelve() {
		assertTrue(DoggoCompetition.getPlaces(21).contains("12th"));
	}

	@Test
	void testThirteen() {
		assertTrue(DoggoCompetition.getPlaces(21).contains("13th"));
	}

}
