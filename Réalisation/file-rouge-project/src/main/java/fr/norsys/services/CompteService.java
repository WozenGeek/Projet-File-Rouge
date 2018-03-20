package fr.norsys.services;

import fr.norsys.entities.AccessType;
import fr.norsys.entities.Compte;

public interface CompteService {

	public boolean addCompte(String login,String password,boolean actif,AccessType role,String employeId);
	public Compte getCompteByLoginAndPassword(String login,String password);
}
