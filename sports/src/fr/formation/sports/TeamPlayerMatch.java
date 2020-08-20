package fr.formation.sports;

public class TeamPlayerMatch extends Match {

    private Team teamOne;

    private Team teamTwo;

    private String score;

    public TeamPlayerMatch(Team teamOne, Team teamTwo, String score) {
	this.teamOne = teamOne;
	this.teamTwo = teamTwo;
	this.score = score;
    }

    @Override
    void results() {
	System.out.println(teamOne.getName() + " ("
	        + teamOne.getPlayers().size() + ") VS " + teamTwo.getName()
	        + " (" + teamTwo.getPlayers().size() + ") = " + score);
    }
}
