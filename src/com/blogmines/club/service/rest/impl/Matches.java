package com.blogmines.club.service.rest.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.blogmines.club.FixturesData;
import com.blogmines.club.FixturesDataMumbai;
import com.blogmines.club.PointsDataMumbai;
import com.blogmines.club.FixturesDataSunrisers;
import com.blogmines.club.PointsDataSunrisers;
import com.blogmines.club.ResultsDataSunrisers;
import com.blogmines.club.ResultsData;
import com.blogmines.club.PointsData;
import com.blogmines.club.ResultsDataMumbai;
import com.blogmines.club.model.Fixture;
import com.blogmines.club.model.Result;
import com.blogmines.club.model.Team;
import com.sun.jersey.api.JResponse;
import com.sun.jersey.json.impl.provider.entity.JSONArrayProvider;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jettison.json.JSONArray;

@Path("/sv")

public class Matches {
	
	/*
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public JResponse<List<Fixtures>> getFixtures()
	{
		Fixtures fixture = new Fixtures();
		fixture.setTeam1Name("CSK");
		fixture.setTeam1Desc("Chennai Super Kings");
		fixture.setTeam2Name("PWI");
		fixture.setTeam2Desc("Pune Warriors");
		fixture.setVenue("Chennai");
		fixture.setMatchDate("19 04 2012 20:00");
		List<Fixtures> fixtures = new ArrayList<Fixtures>();
		fixtures.add(fixture);
		return JResponse.ok(fixtures).build();
	}
	
	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Fixtures> getFixtures2()
	{
		List<Fixtures> fixtures = new ArrayList<Fixtures>();
		fixtures.addAll(FixturesData.instance.getModel().values() );
		return fixtures; 
	}
	*/
	
	@GET
	@Path("/fixtures1/")
	@Produces(MediaType.TEXT_XML)
	public List<Fixture> getFixturesBrowser() {
		List<Fixture> fixtures = new ArrayList<Fixture>();
		fixtures.addAll( FixturesData.instance.getModel().values() );
		return fixtures;
	}
	
	@GET
	@Path("/fixtures2/")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Fixture> getFixtures2() {
		List<Fixture> fixtures = new ArrayList<Fixture>();
		fixtures.addAll( FixturesData.instance.getModel().values() );
		return fixtures; 
	}
	
	@GET
	@Path("/results/")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Result> getResults() {
		List<Result> results = new ArrayList<Result>();
		results.addAll( ResultsData.instance.getModel().values() );
		return results; 
	}
	
	@GET
	@Path("/fixtures/")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public JSONArray getFixtures()
	{
		List<Fixture> fixtures = new ArrayList<Fixture>();
		fixtures.addAll(FixturesData.instance.getModel().values() );
		JSONArray uriArray = new JSONArray();
		return uriArray.put(fixtures);
	}
	
	@GET
	@Path("/points/")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Team> getPoints() {
		List<Team> pointsTable = new ArrayList<Team>();
		pointsTable.addAll( PointsData.instance.getModel().values() );
		return pointsTable; 
	}
	
	@GET
	@Path("/fixturesMumbai/")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Fixture> getFixturesMumbai() {
		List<Fixture> fixtures = new ArrayList<Fixture>();
		fixtures.addAll( FixturesDataMumbai.instance.getModel().values() );
		return fixtures; 
	}
	
	@GET
	@Path("/resultsMumbai/")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Result> getResultsMumbai() {
		List<Result> results = new ArrayList<Result>();		
		results.addAll( ResultsDataMumbai.instance.getModel().values() );
		return results; 
	}
	
	@GET
	@Path("/pointsMumbai/")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Team> getPointsMumbai() {
		List<Team> pointsTable = new ArrayList<Team>();
		pointsTable.addAll( PointsDataMumbai.instance.getModel().values() );
		return pointsTable; 
	}
	
	@GET
	@Path("/fixturesSunrisers/")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Fixture> getFixturesSunrisers() {
		List<Fixture> fixtures = new ArrayList<Fixture>();
		fixtures.addAll( FixturesDataSunrisers.instance.getModel().values() );
		return fixtures; 
	}
	
	@GET
	@Path("/resultsSunrisers/")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Result> getResultsSunrisers() {
		List<Result> results = new ArrayList<Result>();		
		results.addAll( ResultsDataSunrisers.instance.getModel().values() );
		return results; 
	}
	
	@GET
	@Path("/pointsSunrisers/")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Team> getPointsSunrisers() {
		List<Team> pointsTable = new ArrayList<Team>();
		pointsTable.addAll( PointsDataSunrisers.instance.getModel().values() );
		return pointsTable; 
	}
	
	
	// retuns the number of todos
	// Use http://localhost:8080/de.vogella.jersey.todo/rest/todos/count
	// to get the total number of records
	@GET
	@Path("count")
	@Produces(MediaType.TEXT_PLAIN)
	public String getCount() {
		int count = FixturesData.instance.getModel().size();
		return String.valueOf(count);
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("/foo")
	public GenericEntity<List<String>> stringlist()
	{
	  List<String> list = Arrays.asList("test", "as");

	  return new GenericEntity<List<String>>(list) {};
	}
	


}
