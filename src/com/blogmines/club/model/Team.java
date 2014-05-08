/**
 * 
 */
package com.blogmines.club.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author ravishankar
 *
 */

@XmlRootElement
public class Team {
	
	private String team1Name;
	private String team2Name;
	private String team1Desc;
	private String team2Desc;
	private String matPlayed;
	private String matWon;
	private String matLost;
	private String netRunRate;
	private String totalPoints;
	
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
	public String getTeam1Name() {
		return team1Name;
	}
	public void setTeam1Name(String team1Name) {
		this.team1Name = team1Name;
	}
	public String getTeam2Name() {
		return team2Name;
	}
	public void setTeam2Name(String team2Name) {
		this.team2Name = team2Name;
	}
	public String getTeam1Desc() {
		return team1Desc;
	}
	public void setTeam1Desc(String team1Desc) {
		this.team1Desc = team1Desc;
	}
	public String getTeam2Desc() {
		return team2Desc;
	}
	public void setTeam2Desc(String team2Desc) {
		this.team2Desc = team2Desc;
	}

}
