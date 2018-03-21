package fr.norsys.dao;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.time.LocalDate;

import org.junit.Test;

import fr.norsys.entities.Employe;

public class AddEmployeTest extends AEmployeDaoTest {

	@Test
	public void shouldGetTheSameEmployeWhenEmployeeAdded() throws SQLException {
		dao.addEmploye(new Employe("RR663399", "Bouziane", "Marwane", LocalDate.now(), LocalDate.now(), "Adresse1",
				"wozen.geek@gmail.com", "0623545245"));
		Employe resultat = dao.getById("RR663399");
		assertEquals("RR663399", resultat.getId());
		assertEquals("Bouziane", resultat.getNom());
		assertEquals("Marwane", resultat.getPrenom());
		assertEquals(LocalDate.now(), resultat.getDateEmbauche());
		assertEquals(LocalDate.now(), resultat.getDateNaissance());
		assertEquals("Adresse1", resultat.getAdresse());
		assertEquals("wozen.geek@gmail.com", resultat.getEmail());
		assertEquals("0623545245", resultat.getTelephone());

	}

	@Test(expected = SQLException.class)
	public void souldThrowsExceptionWhenAddedIdExistant() throws SQLException {
		dao.addEmploye(new Employe("EE507609", "Marwane", "Marwane", LocalDate.now(), LocalDate.now(), "Adresse1",
				"wozen.geek@gmail.com", "0623545245"));
		dao.addEmploye(new Employe("EE507609", "Salim", "Alaou", LocalDate.now(), LocalDate.now(), "Adresse1",
				"pholocus@gmail.com", "036236532"));
	}
	
	@Test
	public void shouldGetOneEmployeWhenOneEmployeIsAdded() throws SQLException
	{
		dao.addEmploye(new Employe("TT1539461", "Salim", "Yssine", LocalDate.now(), LocalDate.now(), "Adresse1",
				"email@gmail.com", "0623545245"));
		int resultat = dao.getAllEmployes().size();
		assertEquals(1, resultat);
	}
}
