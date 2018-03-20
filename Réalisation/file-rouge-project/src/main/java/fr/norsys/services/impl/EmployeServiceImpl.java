package fr.norsys.services.impl;

import java.time.LocalDate;

import fr.norsys.dao.EmployeDao;
import fr.norsys.dao.impl.EmployeDaoImpl;
import fr.norsys.entities.Employe;
import fr.norsys.services.EmployeService;

public class EmployeServiceImpl implements EmployeService{

	private EmployeDao dao = new EmployeDaoImpl();
	@Override
	public boolean addEmploye(String id, String nom, String prenom, LocalDate dateNaissance, LocalDate dateEmbauche,
			String adresse, String email, String telephone) {
		return dao.addEmploye(new Employe(id, nom, prenom, dateNaissance, dateEmbauche, adresse, email, telephone));
	}

	@Override
	public Employe getEmployeById(String id) {
		return dao.getById(id);
	}

}
