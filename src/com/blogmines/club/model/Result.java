package com.blogmines.club.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Result extends Team {
	
	private String resultDesc;
	private String matchDate;
	private String venue;
	private String link;
	
	public String getResultDesc() {
		return resultDesc;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}

	public String getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Result()
	{
		
	}
}
