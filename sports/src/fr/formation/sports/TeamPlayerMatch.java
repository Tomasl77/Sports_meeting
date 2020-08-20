package fr.formation.sports;

public class TeamPlayerMatch extends Match {

    private Team teamOne;

    private Team teamTwo;

    public TeamPlayerMatch(Team teamOne, Team teamTwo) {
	super();
	this.teamOne = teamOne;
	this.teamTwo = teamTwo;
    }

    @Override
    void results() {
	System.out.println(teamOne.getName() + " (" + teamOne.getTeamSize()
	        + ") VS " + teamTwo.getName() + " (" + teamTwo.getTeamSize()
	        + ") = " + super.getScore());
    }
}
