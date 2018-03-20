package fr.norsys.dao;

import fr.norsys.entities.Employe;

public interface EmployeDao {
	public boolean addEmploye(Employe employe);
	public Employe getById(String id);
}
