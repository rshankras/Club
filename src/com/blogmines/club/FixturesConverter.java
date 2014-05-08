package com.blogmines.club;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

import com.blogmines.club.model.Fixture;

@XmlRootElement(name="Fixtures")
public class FixturesConverter {
	ArrayList fixtures;
	public ArrayList getFixturesCol()
	{
		return fixtures;
	}
	public void setFixture(Fixture fixture)
	{
		if (fixtures == null)
		{
			fixtures = new ArrayList();
		}
		fixtures.add(fixture);
	}
}
