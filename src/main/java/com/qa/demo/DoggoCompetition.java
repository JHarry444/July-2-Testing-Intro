package com.qa.demo;

import java.util.ArrayList;

public class DoggoCompetition {

	public static ArrayList<String> getPlaces(int place) {
		ArrayList<String> places = new ArrayList<>();

		for (int i = 1; i <= 100; i++) {
			if (i == place)
				continue;

			if (i > 10 && i < 14)
				places.add(i + "th");
			else if (i % 10 == 1)
				places.add(i + "st");
			else if (i % 10 == 2)
				places.add(i + "nd");
			else if (i % 10 == 3)
				places.add(i + "rd");
			else
				places.add(i + "th");
		}

		return places;
	}

}
