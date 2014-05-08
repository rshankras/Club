package com.blogmines.club.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Model for holding Fixtures data.
 * @author ravishankar
 *
 */
@XmlRootElement
public class Fixture extends Team{

private String venue;
private String matchDate;

public Fixture()
{
	super();
}
/**
 * @return the venue
 */
public String getVenue() {
	return venue;
}
/**
 * @param venue the venue to set
 */
public void setVenue(String venue) {
	this.venue = venue;
}
/**
 * @return the matchDate
 */
public String getMatchDate() {
	return matchDate;
}
/**
 * @param matchDate the matchDate to set
 */
public void setMatchDate(String matchDate) {
	this.matchDate = matchDate;
}
}
