package fr.norsys.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Types;
import java.util.List;

public class DbConnection {

	private static DBConfiguration dbConfiguration = new DBConfiguration();
	private static DbConnection dbConnection;
	private Connection connection;

	private DbConnection() {

	}

	public static DbConnection getSingleInstance() {
		if (dbConnection == null) {
			dbConnection = new DbConnection();
		}
		return dbConnection;
	}

	public Connection getConnection() {
		// TODO : Remplacer null avec Optional
		try {
			Class.forName(dbConfiguration.get("db.driver"));
			connection = DriverManager.getConnection(dbConfiguration.get("db.url"),dbConfiguration.get("db.username") ,dbConfiguration.get("db.password"));
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public void closeConnection() {
		try {
			if (!connection.isClosed()) {
				try {
					this.connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
