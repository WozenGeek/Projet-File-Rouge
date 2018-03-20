package fr.norsys.services;

import java.time.LocalDate;

import fr.norsys.entities.Employe;

public interface EmployeService {
	public boolean addEmploye(String id, String nom, String prenom, LocalDate dateNaissance, LocalDate dateEmbauche,
			String adresse, String email, String telephone);
	public Employe getEmployeById(String id);
}
