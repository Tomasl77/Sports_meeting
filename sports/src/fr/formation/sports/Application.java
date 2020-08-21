package fr.formation.sports;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
	Player tomas = new Player("Tomas", 1);
	Player johanna = new Player("Johanna", 10);
	Referee refereeSingle = new Referee("Rambo");
	Match firstMatch = new SinglePlayerMatch(tomas, johanna, refereeSingle);
	Match secondMatch = new SinglePlayerMatch(johanna, tomas,
	        refereeSingle);
	Team teamOne = new Team("Chipo", tomas, johanna);
	Team teamTwo = new Team("Merguez", johanna, tomas);
	Referee refereeTeam = new Referee("Derrick");
	Match thirdMatch = new TeamPlayerMatch(teamOne, teamTwo, refereeTeam);
	Team teamThree = new Team("Chocolatine", tomas, johanna, tomas);
	Team teamFour = new Team("Pain aux chocolat", johanna, tomas, tomas);
	Match forthMatch = new TeamPlayerMatch(teamThree, teamFour,
	        refereeTeam);
	List<Match> sportMeeting = new ArrayList<>();
	sportMeeting.add(firstMatch);
	sportMeeting.add(secondMatch);
	sportMeeting.add(thirdMatch);
	sportMeeting.add(forthMatch);
	beginChampionship(sportMeeting);
    }

    private static void beginChampionship(List<Match> sportMeeting) {
	SportMeeting.beginChampionship(sportMeeting);
    }
}
