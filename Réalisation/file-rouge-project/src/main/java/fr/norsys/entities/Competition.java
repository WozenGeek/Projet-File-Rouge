package fr.norsys.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Competition {

	private int id;
	private LocalDate dateDebut;
	private String image;
	private List<Poule> poules = new ArrayList<>();
	private List<Participation> participation= new ArrayList<>();
	public Competition() {
		super();
	}
	public Competition(int id, LocalDate dateDebut, String image) {
		super();
		this.id = id;
		this.dateDebut = dateDebut;
		this.image = image;
	}
	public Competition( LocalDate dateDebut, String image) {
		super();
		this.dateDebut = dateDebut;
		this.image = image;
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public List<Poule> getPoules() {
		return poules;
	}
	public void setPoules(List<Poule> poules) {
		this.poules = poules;
	}
	public List<Participation> getParticipation() {
		return participation;
	}
	public void setParticipation(List<Participation> participation) {
		this.participation = participation;
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
		Competition other = (Competition) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}