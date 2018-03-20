package fr.norsys.entities;

import java.util.*;

public class Poule {

	
	private int id;
	private String intitule;
	private Competition competition;
	private List<Match> matches;
	public Poule(int id, String intitule, Competition competition) {
		super();
		this.id = id;
		this.intitule = intitule;
		this.competition = competition;
	}
	public Poule(String intitule, Competition competition) {
		super();
		this.intitule = intitule;
		this.competition = competition;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public Competition getCompetition() {
		return competition;
	}
	public void setCompetition(Competition competition) {
		this.competition = competition;
	}
	public List<Match> getMatches() {
		return matches;
	}
	public void setMatches(List<Match> matches) {
		this.matches = matches;
	}
	
	

}