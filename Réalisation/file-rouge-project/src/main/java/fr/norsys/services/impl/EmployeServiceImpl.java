package fr.norsys.services.impl;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import fr.norsys.dao.EmployeDao;
import fr.norsys.dao.impl.EmployeDaoImpl;
import fr.norsys.entities.Employe;
import fr.norsys.services.EmployeService;

public class EmployeServiceImpl implements EmployeService{

	private EmployeDao dao = new EmployeDaoImpl();
	
	@Override
	public boolean addEmploye(String id, String nom, String prenom, LocalDate dateNaissance, LocalDate dateEmbauche,
			String adresse, String email, String telephone) throws SQLException {
		return dao.addEmploye(new Employe(id, nom, prenom, dateNaissance, dateEmbauche, adresse, email, telephone));
	}

	@Override
	public Employe getEmployeById(String id)throws SQLException  {
		return dao.getById(id);
	}

	@Override
	public List<Employe> getAllEmployes() throws SQLException {
		return dao.getAllEmployes();
	}

}
