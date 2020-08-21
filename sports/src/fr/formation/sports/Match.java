package fr.formation.sports;

public abstract class Match {

    private String score = Utils.generateRandomScore(0, 3);

    private String scoreHalfTime;

    private Referee referee;

    public Match(Referee referee) {
	this.referee = referee;
    }

    public String getScore() {
	return score;
    }

    public String getRefereeName() {
	return referee.getName();
    }

    public void saveScoreHalfTime() {
	this.scoreHalfTime = score;
    }

    public String getEndScore() {
	return Utils.getRandomEndScore(scoreHalfTime);
    }

    public String getScoreHalfTime() {
	return scoreHalfTime;
    }

    abstract void results();
}
