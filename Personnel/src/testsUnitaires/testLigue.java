package testsUnitaires;

import static commandLineMenus.rendering.examples.util.InOut.getString;
import static org.junit.jupiter.api.Assertions.*;

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
	void addEmploye() throws SauvegardeImpossible
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Gérard", "g.bouchard@gmail.com", "01/01/2020", "02/02/2021", "azerty"); 
		assertEquals(employe, ligue.getEmployes().first());
	}
	
	@Test
	void modifEmploye() throws SauvegardeImpossible 
	{
		Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
		Employe employe = ligue.addEmploye("Bouchard", "Gérard", "g.bouchard@gmail.com", "01/01/2020", "02/02/2021", "azerty"); 
		System.out.println(employe);
		employe.setNom("Bouchard2");
		employe.setPrenom("Gérard2");
		employe.setMail("rule@34.com");
		employe.setDatedebut("01/01/2001");
		employe.setDatefin("02/02/2002");
		employe.setPassword("qwerty");
		assertEquals(employe, ligue.getEmployes().first());
	}
}
