package fr.formation.sports;

public class SinglePlayerMatch extends Match {

    private Player playerOne;

    private Player playerTwo;

    public SinglePlayerMatch(Player playerOne, Player playerTwo) {
	super();
	this.playerOne = playerOne;
	this.playerTwo = playerTwo;
    }

    @Override
    void results() {
	System.out.println(playerOne.getName() + " ( N°" + playerOne.getNumber()
	        + ") VS " + playerTwo.getName() + " ( N°"
	        + playerTwo.getNumber() + ") = " + super.getScore());
    }
}
