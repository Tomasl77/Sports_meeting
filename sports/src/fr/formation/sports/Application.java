package fr.formation.sports;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
	Player tomas = new Player("Tomas", 1);
	Player johanna = new Player("Johanna", 10);
	Match firstMatch = new SinglePlayerMatch(tomas, johanna);
	Match secondMatch = new SinglePlayerMatch(johanna, tomas);
	Team teamOne = new Team("Chipo", tomas, johanna);
	Team teamTwo = new Team("Merguez", johanna, tomas);
	Match thirdMatch = new TeamPlayerMatch(teamOne, teamTwo);
	Team teamThree = new Team("Chocolatine", tomas, johanna);
	Team teamFour = new Team("Pain aux chocolat", johanna, tomas);
	Match forthMatch = new TeamPlayerMatch(teamThree, teamFour);
	List<Match> sportMeeting = new ArrayList<>();
	sportMeeting.add(firstMatch);
	beginChampionship(sportMeeting);
    }

    private static void beginChampionship(List<Match> sportMeeting) {
	SportMeeting.beginChampionship(sportMeeting);
    }
}
