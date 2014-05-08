package com.blogmines.club;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import java.util.ArrayList;

import com.blogmines.club.util.CSVFileReader;

import com.blogmines.club.model.Team;

public enum PointsDataSunrisers {
	instance;
	
	private Map<Integer, Team> contentProvider = new HashMap<Integer, Team>();
	
	private PointsDataSunrisers() {
		Team team = new Team();
		try 
		{
			InputStream inputStream = getClass().getResourceAsStream("PointsTable.csv");
			CSVFileReader fileReader = new CSVFileReader(inputStream);
			ArrayList rows = fileReader.getRows();

			for (int i=0;i < rows.size();i++)
			{
				String[] dataArray = (String[])rows.get(i);
				team = new Team();
				team.setTeam1Name(dataArray[0].replace('"',' ').trim());
				team.setTeam1Desc(dataArray[1].replace('"',' ').trim());
				team.setMatPlayed(dataArray[2].replace('"',' ').trim());
				team.setMatWon(dataArray[3].replace('"',' ').trim());
				team.setMatLost(dataArray[4].replace('"',' ').trim());
				team.setNetRunRate(dataArray[5].replace('"',' ').trim());
				team.setTotalPoints(dataArray[6].replace('"',' ').trim());
				contentProvider.put(i+1, team);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}

	}
	
	public Map<Integer, Team> getModel(){
		return contentProvider;
	}
}