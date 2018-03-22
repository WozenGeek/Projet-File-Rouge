package fr.norsys.dao.employe;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.time.LocalDate;

import org.junit.Test;

import fr.norsys.entities.Employe;

public class AddEmployeTest extends AEmployeDaoTest {

	@Test
	public void shouldGetTheSameEmployeWhenEmployeeAdded() throws SQLException {
		Employe employe = new Employe("RR663399", "Bouziane", "Marwane", LocalDate.now(), LocalDate.now(), "Adresse1",
				"wozen.geek@gmail.com", "0623545245");
		dao.addEmploye(employe);
		Employe resultat = dao.getById(employe.getId());
		assertEquals(employe.getId(), resultat.getId());
		assertEquals(employe.getNom(), resultat.getNom());
		assertEquals(employe.getPrenom(), resultat.getPrenom());
		assertEquals(employe.getDateEmbauche(), resultat.getDateEmbauche());
		assertEquals(employe.getDateNaissance(), resultat.getDateNaissance());
		assertEquals(employe.getAdresse(), resultat.getAdresse());
		assertEquals(employe.getEmail(), resultat.getEmail());
		assertEquals(employe.getTelephone(), resultat.getTelephone());

	}

	@Test(expected = SQLException.class)
	public void souldThrowsExceptionWhenAddedIdExistant() throws SQLException {
		dao.addEmploye(new Employe("EE507609", "Marwane", "Marwane", LocalDate.now(), LocalDate.now(), "Adresse1",
				"wozen.geek@gmail.com", "0623545245"));
		dao.addEmploye(new Employe("EE507609", "Salim", "Alaou", LocalDate.now(), LocalDate.now(), "Adresse1",
				"pholocus@gmail.com", "036236532"));
	}
	
	
}
