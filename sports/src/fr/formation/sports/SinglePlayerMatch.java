package fr.formation.sports;

public class SinglePlayerMatch extends Match {

    private Player playerOne;

    private Player playerTwo;

    private String score;

    public SinglePlayerMatch(Player playerOne, Player playerTwo, String score) {
	this.playerOne = playerOne;
	this.playerTwo = playerTwo;
	this.score = score;
    }

    @Override
    void results() {
	System.out.println(playerOne.getName() + " ( N°" + playerOne.getNumber()
	        + ") VS " + playerTwo.getName() + " ( N°"
	        + playerTwo.getNumber() + ") = " + score);
    }
}
