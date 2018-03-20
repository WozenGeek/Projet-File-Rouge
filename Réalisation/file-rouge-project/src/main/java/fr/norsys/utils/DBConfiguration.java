package fr.norsys.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DBConfiguration {

	Properties prop = new Properties();
	InputStream input = null;

	public DBConfiguration() {
		try {
			prop.load(getClass().getClassLoader().getResourceAsStream("db-configuration.properties"));
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}

	public String get(String key) {
		return prop.getProperty(key);
	}
}
