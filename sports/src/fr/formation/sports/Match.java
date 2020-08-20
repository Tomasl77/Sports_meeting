package fr.formation.sports;

public abstract class Match {

    private String score = Utils.generateRandomScore();

    public Match() {
    }

    public String getScore() {
	return score;
    }

    abstract void results();
}
