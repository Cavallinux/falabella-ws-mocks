package com.falabella.ws.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomUtils {
    public static String[] letters = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
    public static String[] numbers = { "1", "2", "3", "4", "5" };

    public static List<String> generateGridChallenge() {
	Random letterRandom = new Random();
	Random numbersRandom = new Random();
	List<String> gridChallenge = new ArrayList<String>();
	
	for (int i = 0; i < 3; i++) {
	    StringBuilder builder = new StringBuilder();
	    builder.append(letters[letterRandom.nextInt(letters.length)]);
	    builder.append(numbers[numbersRandom.nextInt(numbers.length)]);

	    gridChallenge.add(builder.toString());
	}

	return gridChallenge;
    }
}