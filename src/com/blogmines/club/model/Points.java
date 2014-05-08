package com.blogmines.club.model;

public class Points {
	
	private String teamName;
	private String matPlayed;
	private String matWon;
	private String matLost;
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getMatPlayed() {
		return matPlayed;
	}
	public void setMatPlayed(String matPlayed) {
		this.matPlayed = matPlayed;
	}
	public String getMatWon() {
		return matWon;
	}
	public void setMatWon(String matWon) {
		this.matWon = matWon;
	}
	public String getMatLost() {
		return matLost;
	}
	public void setMatLost(String matLost) {
		this.matLost = matLost;
	}
	public String getNetRunRate() {
		return netRunRate;
	}
	public void setNetRunRate(String netRunRate) {
		this.netRunRate = netRunRate;
	}
	public String getTotalPoints() {
		return totalPoints;
	}
	public void setTotalPoints(String totalPoints) {
		this.totalPoints = totalPoints;
	}
	private String netRunRate;
	private String totalPoints;
}
