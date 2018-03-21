package fr.norsys.entities;

import java.time.LocalDate;
import java.util.*;

public class Equipe {

	
	private int id;
	private String nom;
	private LocalDate dateFondation;
	private String nomEntraineur;
	private String siege;
	private String image;
	private List<Participation> participation;
	private List<Match> matches;
	
	public Equipe(int id, String nom, LocalDate dateFondation, String nomEntraineur, String siege, String image,
			List<Participation> participation, List<Match> matches) {
		super();
		this.id = id;
		this.nom = nom;
		this.dateFondation = dateFondation;
		this.nomEntraineur = nomEntraineur;
		this.siege = siege;
		this.image = image;
		this.participation = participation;
		this.matches = matches;
	}

	public Equipe(String nom, LocalDate dateFondation, String nomEntraineur, String siege, String image) {
		super();
		this.nom = nom;
		this.dateFondation = dateFondation;
		this.nomEntraineur = nomEntraineur;
		this.siege = siege;
		this.image = image;
	}

	public Equipe(String nom, LocalDate dateFondation, String nomEntraineur, String siege, String image,
			List<Participation> participation, List<Match> matches) {
		super();
		this.nom = nom;
		this.dateFondation = dateFondation;
		this.nomEntraineur = nomEntraineur;
		this.siege = siege;
		this.image = image;
		this.participation = participation;
		this.matches = matches;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public LocalDate getDateFondation() {
		return dateFondation;
	}

	public void setDateFondation(LocalDate dateFondation) {
		this.dateFondation = dateFondation;
	}

	public String getNomEntraineur() {
		return nomEntraineur;
	}

	public void setNomEntraineur(String nomEntraineur) {
		this.nomEntraineur = nomEntraineur;
	}

	public String getSiege() {
		return siege;
	}

	public void setSiege(String siege) {
		this.siege = siege;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<Participation> getParticipation() {
		return participation;
	}

	public void setParticipation(List<Participation> participation) {
		this.participation = participation;
	}

	public List<Match> getMatches() {
		return matches;
	}

	public void setMatches(List<Match> matches) {
		this.matches = matches;
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
		Equipe other = (Equipe) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	

}