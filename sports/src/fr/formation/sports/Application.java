package fr.formation.sports;

import static fr.formation.sports.Utils.generateRandomScore;

public class Application {

    public static void main(String[] args) {
	Player tomas = new Player("Tomas", 1);
	Player johanna = new Player("Johanna", 10);
	Match firstMatch = new SinglePlayerMatch(tomas, johanna,
	        generateRandomScore());
	Match secondMatch = new SinglePlayerMatch(johanna, tomas,
	        generateRandomScore());
	Team teamOne = new Team("Chipo", tomas, johanna);
	Team teamTwo = new Team("Merguez", johanna, tomas);
	Match thirdMatch = new TeamPlayerMatch(teamOne, teamTwo,
	        generateRandomScore());
	Team teamThree = new Team("Chocolatine", tomas, johanna);
	Team teamFour = new Team("Pain aux chocolat", johanna, tomas);
	Match forthMatch = new TeamPlayerMatch(teamThree, teamFour,
	        generateRandomScore());
	SportMeeting sportMeeting = new SportMeeting(firstMatch, secondMatch,
	        thirdMatch, forthMatch);
	beginChampionship(sportMeeting);
    }

    private static void beginChampionship(SportMeeting sportMeeting) {
	for (Match match : sportMeeting.getMatches()) {
	    match.results();
	}
    }
}
