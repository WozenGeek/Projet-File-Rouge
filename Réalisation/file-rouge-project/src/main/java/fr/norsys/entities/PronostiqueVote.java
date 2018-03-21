package fr.norsys.entities;

import java.time.LocalDate;

public class PronostiqueVote {

	protected int id;
	protected LocalDate datePronostique;
	protected String heurePronostique;
	protected int resultatPronostique;

	protected TypeVictoire typeVictoire;
	protected Employe employe;
	protected Match matche;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDatePronostique() {
		return datePronostique;
	}

	public void setDatePronostique(LocalDate datePronostique) {
		this.datePronostique = datePronostique;
	}

	public String getHeurePronostique() {
		return heurePronostique;
	}

	public void setHeurePronostique(String heurePronostique) {
		this.heurePronostique = heurePronostique;
	}

	public int getResultatPronostique() {
		return resultatPronostique;
	}

	public void setResultatPronostique(int resultatPronostique) {
		this.resultatPronostique = resultatPronostique;
	}

	public TypeVictoire getTypeVictoire() {
		return typeVictoire;
	}

	public void setTypeVictoire(TypeVictoire typeVictoire) {
		this.typeVictoire = typeVictoire;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public Match getMatche() {
		return matche;
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
		PronostiqueVote other = (PronostiqueVote) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public void setMatche(Match matche) {
		this.matche = matche;
	}

	public PronostiqueVote(int id, LocalDate datePronostique, String heurePronostique, int resultatPronostique,
			TypeVictoire typeVictoire, Employe employe, Match matche) {
		super();
		this.id = id;
		this.datePronostique = datePronostique;
		this.heurePronostique = heurePronostique;
		this.resultatPronostique = resultatPronostique;
		this.typeVictoire = typeVictoire;
		this.employe = employe;
		this.matche = matche;
	}

}