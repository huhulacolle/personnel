package testsUnitaires;

import static commandLineMenus.rendering.examples.util.InOut.getString;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import personnel.*;

class testLigue 
{
	GestionPersonnel gestionPersonnel = GestionPersonnel.getGestionPersonnel();
	
	@Test
	void createLigue() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		assertEquals("Fléchettes", ligue.getNom());
	}
	
	@Test
	void delLigue() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		gestionPersonnel.remove(ligue);
		assertEquals(gestionPersonnel.hasLigue(ligue),false);
	}
	
	@Test
	void modifLigue() throws SauvegardeImpossible 
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		ligue.setNom("Flech");
		assertEquals("Flech", ligue.getNom());
	}

	@Test
	void addEmploye() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Gérard", "g.bouchard@gmail.com", "2020-09-09", "2030-06-06", "azerty"); 
		assertEquals(employe, ligue.getEmployes().first());
	}
	
	@Test
	void delEmploye() throws SauvegardeImpossible 
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Gérard", "g.bouchard@gmail.com", "2020-01-08", "2021-06-06", "azerty"); 
		employe.remove();
		assertFalse(ligue.getEmployes().contains(employe));
	}
	
	@Test
	void modifEmploye() throws SauvegardeImpossible, ErreurDateDepart 
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Gérard", "g.bouchard@gmail.com", "2010-09-09", "2020-10-01", "azerty"); 
		employe.setNom("Bouchard2");
		employe.setPrenom("Gérard2");
		employe.setMail("richard@35.com");
		employe.setDateDebut(LocalDate.parse("2002-02-02"));
		employe.setPassword("qwerty");
		assertEquals(employe, ligue.getEmployes().first());
	}
}
