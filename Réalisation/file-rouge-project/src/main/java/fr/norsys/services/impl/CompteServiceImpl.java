package fr.norsys.services.impl;

import java.sql.SQLException;

import fr.norsys.dao.CompteDao;
import fr.norsys.dao.EmployeDao;
import fr.norsys.dao.impl.CompteDaoImpl;
import fr.norsys.dao.impl.EmployeDaoImpl;
import fr.norsys.entities.AccessType;
import fr.norsys.entities.Compte;
import fr.norsys.services.CompteService;

public class CompteServiceImpl implements CompteService {

	private CompteDao dao = new CompteDaoImpl();
	private EmployeDao employeDao = new EmployeDaoImpl();
	
	@Override
	public boolean addCompte(String login, String password, boolean actif, AccessType role,String employeId)throws SQLException {
		
		return dao.addCompte(new Compte(login,employeDao.getById(employeId),password,actif,role));
	}

	@Override
	public Compte getCompteByLoginAndPassword(String login, String password)throws SQLException {
		return dao.getByLoginAndPassword(login, password);
	}

}
