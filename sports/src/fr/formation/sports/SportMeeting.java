package fr.formation.sports;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SportMeeting {

    private List<Match> matchs = new ArrayList<>();

    public SportMeeting(Match... matchs) {
	Objects.requireNonNull(matchs);
	if (matchs.length == 0) {
	    throw new IllegalArgumentException(
	            "Should contains at least 1 match");
	}
	for (Match match : matchs) {
	    addMatch(match);
	}
    }

    public SportMeeting(Match match) {
	addMatch(match);
    }

    public List<Match> getMatches() {
	return matchs;
    }

    private void addMatch(Match match) {
	Objects.requireNonNull(match, "a match cannot be null");
	matchs.add(match);
    }

    @Override
    public String toString() {
	return "Here's the list of results of this meeting : "
	        + Arrays.asList(matchs).toString();
    }
}