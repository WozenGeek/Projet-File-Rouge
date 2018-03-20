package fr.norsys.dao.impl;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import fr.norsys.dao.EmployeDao;
import fr.norsys.entities.Employe;
import fr.norsys.utils.DbConnection;

public class EmployeDaoImpl implements EmployeDao {

	private DbConnection dbConnection = DbConnection.getSingleInstance();

	@Override
	public boolean addEmploye(Employe employe) {
		String sqlQuery = "insert into employe( employe_id, employe_nom, employe_prenom, employe_date_naissance, employe_date_embauche, employe_adresse,employe_email, employe_telephone) values(?,?,?,?,?,?,?,?)";
		boolean succeded = false;
		try {
			PreparedStatement preparedStatement = dbConnection.getConnection().prepareStatement(sqlQuery);
			preparedStatement.setString(1, employe.getId());
			preparedStatement.setString(2, employe.getNom());
			preparedStatement.setString(3, employe.getPrenom());
			preparedStatement.setDate(4, Date.valueOf(employe.getDateNaissance()));
			preparedStatement.setDate(5, Date.valueOf(employe.getDateEmbauche()));
			preparedStatement.setString(6, employe.getAdresse());
			preparedStatement.setString(7, employe.getEmail());
			preparedStatement.setString(8, employe.getTelephone());
			if (preparedStatement.executeUpdate() > 0) {
				succeded = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return succeded;
	}

	@Override
	public Employe getById(String id) {
		Employe resultat = new Employe();
		try {
			Statement statement = dbConnection.getConnection().createStatement();
			ResultSet resultSet =  statement.executeQuery("select * from employe where employe_id='"+id+"';");
			
			if(resultSet.next())
			{
				resultat.setId(resultSet.getString("employe_id"));
				resultat.setNom(resultSet.getString("employe_nom"));
				resultat.setPrenom(resultSet.getString("employe_prenom"));
				resultat.setAdresse(resultSet.getString("employe_adresse"));
				resultat.setDateNaissance(resultSet.getDate("employe_date_naissance").toLocalDate());
				resultat.setDateEmbauche(resultSet.getDate("employe_date_embauche").toLocalDate());
				resultat.setEmail(resultSet.getString("employe_email"));
				resultat.setTelephone(resultSet.getString("employe_telephone"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		dbConnection.closeConnection();
		return resultat;
	}

}
