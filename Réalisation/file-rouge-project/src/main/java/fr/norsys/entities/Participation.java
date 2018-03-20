package fr.norsys.entities;

import java.time.LocalDate;


public class Participation {

	
	private int id;
	private LocalDate dateParticipation;
	private int scoreActuel;
	private Competition competition;
	private Equipe equipe;
	
	
	public Participation(int id, LocalDate dateParticipation, Competition competition, Equipe equipe) {
		super();
		this.id = id;
		this.dateParticipation = dateParticipation;
		this.competition = competition;
		this.equipe = equipe;
	}
	public Participation(int id, LocalDate dateParticipation, int scoreActuel, Competition competition, Equipe equipe) {
		super();
		this.id = id;
		this.dateParticipation = dateParticipation;
		this.scoreActuel = scoreActuel;
		this.competition = competition;
		this.equipe = equipe;
	}
	public Participation(LocalDate dateParticipation, int scoreActuel, Competition competition, Equipe equipe) {
		super();
		this.dateParticipation = dateParticipation;
		this.scoreActuel = scoreActuel;
		this.competition = competition;
		this.equipe = equipe;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDateParticipation() {
		return dateParticipation;
	}
	public void setDateParticipation(LocalDate dateParticipation) {
		this.dateParticipation = dateParticipation;
	}
	public int getScoreActuel() {
		return scoreActuel;
	}
	public void setScoreActuel(int scoreActuel) {
		this.scoreActuel = scoreActuel;
	}
	public Competition getCompetition() {
		return competition;
	}
	public void setCompetition(Competition competition) {
		this.competition = competition;
	}
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participation other = (Participation) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	

}