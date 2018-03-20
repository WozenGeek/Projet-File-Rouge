package fr.norsys.entities;

import java.time.LocalDate;
import java.util.*;

public class Match {

	
	private int id;
	private LocalDate dateDebut;
	private String heureDebut;
	private String heureFin;
	private int scoreHote;
	private int scoreInvite;
	private boolean termine;
	private Poule poule;
	private Equipe equipeHote;
	private Equipe equipeInvite;
	private Stade stade;
	private List<PronostiqueVote> pronostiqueVotes;
	public Match() {
		super();
	}
	public Match(LocalDate dateDebut, String heureDebut, String heureFin, int scoreHote, int scoreInvite,
			boolean termine, Poule poule, Equipe equipeHote, Equipe equipeInvite, Stade stade,
			List<PronostiqueVote> pronostiqueVotes) {
		super();
		this.dateDebut = dateDebut;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
		this.scoreHote = scoreHote;
		this.scoreInvite = scoreInvite;
		this.termine = termine;
		this.poule = poule;
		this.equipeHote = equipeHote;
		this.equipeInvite = equipeInvite;
		this.stade = stade;
		this.pronostiqueVotes = pronostiqueVotes;
	}
	public Match(int id, LocalDate dateDebut, String heureDebut, String heureFin, int scoreHote, int scoreInvite,
			boolean termine, Poule poule, Equipe equipeHote, Equipe equipeInvite, Stade stade,
			List<PronostiqueVote> pronostiqueVotes) {
		super();
		this.id = id;
		this.dateDebut = dateDebut;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
		this.scoreHote = scoreHote;
		this.scoreInvite = scoreInvite;
		this.termine = termine;
		this.poule = poule;
		this.equipeHote = equipeHote;
		this.equipeInvite = equipeInvite;
		this.stade = stade;
		this.pronostiqueVotes = pronostiqueVotes;
	}
	public Match(int id, LocalDate dateDebut, String heureDebut, String heureFin, boolean termine, Poule poule,
			Equipe equipeHote, Equipe equipeInvite, Stade stade) {
		super();
		this.id = id;
		this.dateDebut = dateDebut;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
		this.termine = termine;
		this.poule = poule;
		this.equipeHote = equipeHote;
		this.equipeInvite = equipeInvite;
		this.stade = stade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}
	public String getHeureDebut() {
		return heureDebut;
	}
	public void setHeureDebut(String heureDebut) {
		this.heureDebut = heureDebut;
	}
	public String getHeureFin() {
		return heureFin;
	}
	public void setHeureFin(String heureFin) {
		this.heureFin = heureFin;
	}
	public int getScoreHote() {
		return scoreHote;
	}
	public void setScoreHote(int scoreHote) {
		this.scoreHote = scoreHote;
	}
	public int getScoreInvite() {
		return scoreInvite;
	}
	public void setScoreInvite(int scoreInvite) {
		this.scoreInvite = scoreInvite;
	}
	public boolean isTermine() {
		return termine;
	}
	public void setTermine(boolean termine) {
		this.termine = termine;
	}
	public Poule getPoule() {
		return poule;
	}
	public void setPoule(Poule poule) {
		this.poule = poule;
	}
	public Equipe getEquipeHote() {
		return equipeHote;
	}
	public void setEquipeHote(Equipe equipeHote) {
		this.equipeHote = equipeHote;
	}
	public Equipe getEquipeInvite() {
		return equipeInvite;
	}
	public void setEquipeInvite(Equipe equipeInvite) {
		this.equipeInvite = equipeInvite;
	}
	public Stade getStade() {
		return stade;
	}
	public void setStade(Stade stade) {
		this.stade = stade;
	}
	public List<PronostiqueVote> getPronostiqueVotes() {
		return pronostiqueVotes;
	}
	public void setPronostiqueVotes(List<PronostiqueVote> pronostiqueVotes) {
		this.pronostiqueVotes = pronostiqueVotes;
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
		Match other = (Match) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	

}