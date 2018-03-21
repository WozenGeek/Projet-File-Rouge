package fr.norsys.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.norsys.dao.CompteDao;
import fr.norsys.dao.EmployeDao;
import fr.norsys.entities.AccessType;
import fr.norsys.entities.Compte;
import fr.norsys.utils.DbConnection;

public class CompteDaoImpl implements CompteDao {

	private DbConnection dbConnection = DbConnection.getSingleInstance();
	private EmployeDao EmployeDao = new EmployeDaoImpl();

	@Override
	public boolean addCompte(Compte compte) {
		String sqlQuery = "insert into compte(compte_login,compte_password,compte_actif,compte_role,employe_id) values(?,?,?,?,?)";
		boolean succeded = false;
		try {
			PreparedStatement preparedStatement = dbConnection.getConnection().prepareStatement(sqlQuery);
			preparedStatement.setString(1, compte.getLogin());
			preparedStatement.setString(2, compte.getPassword());
			preparedStatement.setBoolean(3, compte.isActif());
			preparedStatement.setInt(4, compte.getRole().ordinal());
			preparedStatement.setString(5, compte.getEmploye().getId());
			if (preparedStatement.executeUpdate() > 0) {
				succeded = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return succeded;
	}

	@Override
	public Compte getByLoginAndPassword(String login,String password) {
		String sqlQuery = "select * from compte where login=? and password=?;";
		Compte resultat = new Compte();
		try {
			PreparedStatement preparedStatement = dbConnection.getConnection().prepareStatement(sqlQuery);
			preparedStatement.setString(1, login);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next())
			{
				resultat.setActif(resultSet.getBoolean("compte_actif"));
				resultat.setEmploye(EmployeDao.getById(resultSet.getString("employe_id")));
				resultat.setLogin(resultSet.getString("compte_login"));
				resultat.setPassword(resultSet.getString("compte_login"));
				resultat.setRole(AccessType.values()[resultSet.getInt("compte_login")]);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultat;
	}

}
