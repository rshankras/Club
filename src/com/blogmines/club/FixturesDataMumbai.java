package com.blogmines.club;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import java.util.ArrayList;

import com.blogmines.club.util.CSVFileReader;

import com.blogmines.club.model.Fixture;

public enum FixturesDataMumbai {
	instance;
	
	private Map<Integer, Fixture> contentProvider = new HashMap<Integer, Fixture>();
	
	private FixturesDataMumbai() {
		Fixture fixture = new Fixture();
		try 
		{
			InputStream inputStream = getClass().getResourceAsStream("Fixtures_Mumbai.csv");
			CSVFileReader fileReader = new CSVFileReader(inputStream);
			ArrayList rows = fileReader.getRows();

			for (int i=0;i < rows.size();i++)
			{
				String[] dataArray = (String[])rows.get(i);
				fixture = new Fixture();
				fixture.setTeam1Name(dataArray[0].replace('"',' ').trim());
				fixture.setTeam1Desc(dataArray[1].replace('"',' ').trim());
				fixture.setTeam2Name(dataArray[2].replace('"',' ').trim());
				fixture.setTeam2Desc(dataArray[3].replace('"',' ').trim());
				fixture.setMatchDate(dataArray[4].replace('"',' ').trim());
				fixture.setVenue(dataArray[5].replace('"',' ').trim());
				contentProvider.put(i+1, fixture);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}

	}	
	public Map<Integer, Fixture> getModel(){
		return contentProvider;
	}
}