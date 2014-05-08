package com.blogmines.club;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

import com.blogmines.club.model.Team;

@XmlRootElement(name="PointsTable")
public class PointsConverter {
	ArrayList pointsTable;
	public ArrayList getPointsCol()
	{
		return pointsTable;
	}
	public void SetTeam(Team team)
	{
		if (pointsTable == null)
		{
			pointsTable = new ArrayList();
		}
		pointsTable.add(team);
	}
}
