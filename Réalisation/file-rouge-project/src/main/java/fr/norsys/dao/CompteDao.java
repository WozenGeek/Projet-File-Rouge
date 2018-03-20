package fr.norsys.dao;

import fr.norsys.entities.Compte;

public interface CompteDao {

	public boolean addCompte(Compte compte);
	public Compte getByLoginAndPassword(String login,String password);
}
