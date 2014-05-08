package com.blogmines.club;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import java.util.ArrayList;

import com.blogmines.club.util.CSVFileReader;

import com.blogmines.club.model.Result;

public enum ResultsDataSunrisers {
	instance;
	
	private Map<Integer, Result> contentProvider = new HashMap<Integer, Result>();
	
	private ResultsDataSunrisers() {
		Result result = new Result();
		try 
		{
			InputStream inputStream = getClass().getResourceAsStream("Results_Sunrisers.csv");
			CSVFileReader fileReader = new CSVFileReader(inputStream);
			ArrayList rows = fileReader.getRows();

			for (int i=0;i < rows.size();i++)
			{
				String[] dataArray = (String[])rows.get(i);
				result = new Result();
				result.setTeam1Name(dataArray[0].replace('"',' ').trim());
				result.setTeam1Desc(dataArray[1].replace('"',' ').trim());
				result.setTeam2Name(dataArray[2].replace('"',' ').trim());
				result.setTeam2Desc(dataArray[3].replace('"',' ').trim());
				result.setMatchDate(dataArray[4].replace('"',' ').trim());
				result.setVenue(dataArray[5].replace('"',' ').trim());
				result.setResultDesc(dataArray[6].replace('"',' ').trim());
				result.setLink(dataArray[7].replace('"',' ').trim());
				contentProvider.put(i+1, result);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}

	}
		
	public Map<Integer, Result> getModel(){
		return contentProvider;
	}
}