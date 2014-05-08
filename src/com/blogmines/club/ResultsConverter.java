package com.blogmines.club;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

import com.blogmines.club.model.Fixture;
import com.blogmines.club.model.Result;

@XmlRootElement(name="Results")
public class ResultsConverter {
	ArrayList results;
	public ArrayList getFixturesCol()
	{
		return results;
	}
	public void SetResult(Result result)
	{
		if (results == null)
		{
			results = new ArrayList();
		}
		results.add(result);
	}
}
