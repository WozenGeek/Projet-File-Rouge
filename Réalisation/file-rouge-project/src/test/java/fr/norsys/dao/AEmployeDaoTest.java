package fr.norsys.dao;

import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Before;
import org.junit.BeforeClass;

import fr.norsys.dao.impl.EmployeDaoImpl;
import fr.norsys.utils.DbConnection;

public abstract class AEmployeDaoTest {

	protected EmployeDao dao;

	@BeforeClass
	public static void SettingUpDatabase() throws SQLException {
		System.out.println("Setting up the database !");
		// creation de la table employe dans la base H2
		DbConnection connection = DbConnection.getSingleInstance();
		Statement statement = connection.getConnection().createStatement();
		String sqlQuery = "CREATE TABLE employe (employe_id varchar(50) primary key, employe_nom varchar(50) not null, employe_prenom varchar(50) not null, employe_date_naissance date not null, employe_date_embauche date not null, employe_adresse varchar(255) not null, employe_email varchar(50) not null, employe_telephone varchar(20) not null);";
		statement.executeUpdate(sqlQuery);
	}

	@Before
	public void initializeDao() {
		this.dao = new EmployeDaoImpl();
	}
	

}
