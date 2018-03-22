package fr.norsys.dao.employe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.sql.SQLException;
import java.time.LocalDate;

import org.junit.Test;

import fr.norsys.entities.Employe;

public class getEmployeByIdTest extends AEmployeDaoTest {

	@Test
	public void shouldGetEmployeWhenIdExistant() throws SQLException
	{
		dao.addEmploye(new Employe("EE1", "Employe1", "Emp1", LocalDate.now(), LocalDate.now(), "Adresse1",
				"email@gmail.com", "0623545245"));
		Employe resultat = dao.getById("EE1");
		assertEquals("EE1", resultat.getId());
	}
	@Test
	public void shouldGetEmptyEmployeWhenIdNotExistant() throws SQLException
	{
		Employe resultat = dao.getById("EE1");
		assertNull(resultat.getId());
	}
}
