package fr.norsys.dao.employe;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.time.LocalDate;

import org.junit.Test;

import fr.norsys.entities.Employe;

public class GetAllEmployeTest  extends AEmployeDaoTest {

	@Test
	public void shouldGetThreeEmployeWhenThreeEmployesAreAdded() throws SQLException
	{
		dao.addEmploye(new Employe("EE1", "Employe1", "Emp1", LocalDate.now(), LocalDate.now(), "Adresse1",
				"email@gmail.com", "0623545245"));
		dao.addEmploye(new Employe("EE2", "Employe2", "Em2", LocalDate.now(), LocalDate.now(), "Adresse1",
				"email@gmail.com", "0623545245"));
		dao.addEmploye(new Employe("EE3", "Employe3", "Emp3", LocalDate.now(), LocalDate.now(), "Adresse1",
				"email@gmail.com", "0623545245"));
		int resultat = dao.getAllEmployes().size();
		assertEquals(3, resultat);
	}
	@Test
	public void shouldGetNothingWhenEmptyEmployeTable() throws SQLException
	{
		int resultat = dao.getAllEmployes().size();
		assertEquals(0, resultat);
	}
}
