package fr.norsys.entities;

import java.time.LocalDate;
import java.util.*;

public class Employe {

	private String id;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	private LocalDate dateEmbauche;
	private String adresse;
	private String email;
	private String telephone;
	private Compte compte;
	List<PronostiqueVote> pronostiqueVote = new ArrayList<>();
	public Employe() {
		super();
	}
	public Employe(String id, String nom, String prenom, LocalDate dateNaissance, LocalDate dateEmbauche,
			String adresse, String email, String telephone) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.dateEmbauche = dateEmbauche;
		this.adresse = adresse;
		this.email = email;
		this.telephone = telephone;
	}
	
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	public List<PronostiqueVote> getPronostiqueVote() {
		return pronostiqueVote;
	}
	public void setPronostiqueVote(List<PronostiqueVote> pronostiqueVote) {
		this.pronostiqueVote = pronostiqueVote;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public LocalDate getDateEmbauche() {
		return dateEmbauche;
	}
	public void setDateEmbauche(LocalDate dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Employe other = (Employe) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}