package fr.norsys.services;

import java.sql.SQLException;

import fr.norsys.entities.AccessType;
import fr.norsys.entities.Compte;

public interface CompteService {

	public boolean addCompte(String login,String password,boolean actif,AccessType role,String employeId) throws SQLException;
	public Compte getCompteByLoginAndPassword(String login,String password)throws SQLException;
}
