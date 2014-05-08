package com.blogmines.club.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * This reads CSVFile and populates the values in ArrayList
 * @author ravishankar
 *
 */

public class CSVFileReader {

	private InputStream inputStream;

	public CSVFileReader(InputStream inputStream)
	{
		this.inputStream = inputStream;
	}
	
	public ArrayList getRows() throws Exception
	{
		ArrayList rows = new ArrayList();
		 InputStreamReader in= new InputStreamReader(inputStream);
		BufferedReader CSVFile = 
			        new BufferedReader(in);
		String fieldRow = CSVFile.readLine();
		int i = 0;
		 while (fieldRow != null){
			   String[] dataArray = fieldRow.split(",");
				   rows.add(i, dataArray);
			   fieldRow = CSVFile.readLine(); // Read next line of data.
			   i++;
			  }
		return rows;
	}
}
