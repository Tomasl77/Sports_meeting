package fr.formation.sports;

import java.util.Random;

public class Utils {

    public static String generateRandomScore(int min, int max) {
	String score1 = randomScore(min, max);
	String score2 = randomScore(min, max);
	return score1 + "-" + score2;
    }

    private static String randomScore(int min, int max) {
	int scoreToReturn = new Random().nextInt(max - min + 1) + min;
	return String.valueOf(scoreToReturn);
    }

    public static String getRandomEndScore(String scoreHalfTime) {
	String[] score = scoreHalfTime.split("-");
	String score1 = randomScore(Integer.parseInt(score[0]), 3);
	String score2 = randomScore(Integer.parseInt(score[1]), 3);
	return "(" + score1 + " - " + score2 + ")";
    }
}
