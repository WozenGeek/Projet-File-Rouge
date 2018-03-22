package fr.norsys.dao.employe;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
import org.junit.Before;

import fr.norsys.dao.EmployeDao;
import fr.norsys.dao.impl.EmployeDaoImpl;
import fr.norsys.utils.DbConnection;

public abstract class AEmployeDaoTest {

	protected EmployeDao dao;
	private Connection connection;
	@Before
	public void SettingUpDatabase() throws SQLException {
		// Creation de la table employe
		connection = DbConnection.getSingleInstance().getConnection();
		Statement statement = connection.createStatement();
		String sqlQuery = "CREATE TABLE employe (employe_id varchar(50) primary key, employe_nom varchar(50) not null, employe_prenom varchar(50) not null, employe_date_naissance date not null, employe_date_embauche date not null, employe_adresse varchar(255) not null, employe_email varchar(50) not null, employe_telephone varchar(20) not null);";
		statement.executeUpdate(sqlQuery);
		//ajout des enregistrments
		//instanciation du DAO des employes
		this.dao = new EmployeDaoImpl();
		System.out.println("Setting up the database !");
	}
	@After
	public void CleanUpTheDatabase() throws SQLException
	{
		Statement statement = connection.createStatement();
		String sqlQuery = "DROP TABLE employe;";
		statement.executeUpdate(sqlQuery);
		connection.close();
		
	}

}
