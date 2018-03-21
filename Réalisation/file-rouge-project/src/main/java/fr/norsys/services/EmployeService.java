package fr.norsys.services;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import fr.norsys.entities.Employe;

public interface EmployeService {
	public boolean addEmploye(String id, String nom, String prenom, LocalDate dateNaissance, LocalDate dateEmbauche,
			String adresse, String email, String telephone) throws SQLException;
	public Employe getEmployeById(String id)throws SQLException;
	public List<Employe> getAllEmployes() throws SQLException;
}
