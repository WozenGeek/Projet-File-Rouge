package fr.norsys.dao;

import java.sql.SQLException;
import java.util.List;

import fr.norsys.entities.Employe;

public interface EmployeDao {
	public boolean addEmploye(Employe employe) throws SQLException;

	public Employe getById(String id)throws SQLException;

	public List<Employe> getAllEmployes()throws SQLException;
}
