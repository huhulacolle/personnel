package commandLine;

import static commandLineMenus.rendering.examples.util.InOut.getString;

import java.time.LocalDate;

import commandLineMenus.ListOption;
import commandLineMenus.Menu;
import commandLineMenus.Option;
import personnel.Employe;

public class EmployeConsole 
{
	private Option afficher(final Employe employe)
	{
		return new Option("Afficher l'employé", "l", () -> {System.out.println(employe);});
	}

	ListOption<Employe> editerEmploye()
	{
		return (employe) -> editerEmploye(employe);		
	}

	Option editerEmploye(Employe employe)
	{
			Menu menu = new Menu("Gérer le compte " + employe.getNom(), "c");
			menu.add(afficher(employe));
			menu.add(changerNom(employe));
			menu.add(changerPrenom(employe));
			menu.add(changerMail(employe));
			menu.add(changerPassword(employe));
			menu.add(changerDateDebut(employe));
			menu.add(changeDateFin(employe));
			menu.addBack("q");
			return menu;
	}

	private Option changeDateFin(final Employe employe) {
		return new Option("Changer Date Fin", "f", 
				() -> {
					employe.setDateFin(getString("Nouvelle Date fin : "));
					}
			);
	}

	private Option changerDateDebut(final Employe employe) {
		return new Option("Changer Date Départ", "d", 
				() -> {
						employe.setDateDebut(getString("Nouvelle Date départ :"));
					}
			);
	}

	private Option changerNom(final Employe employe)
	{
		return new Option("Changer le nom", "n", 
				() -> {
					System.out.println("Nom actuel : " + employe.getNom());
					employe.setNom(getString("Nouveau nom : "));
					}
			);
	}
	
	private Option changerPrenom(final Employe employe)
	{
		return new Option("Changer le prénom", "p", () -> {
			System.out.println("Prénom actuel : " + employe.getPrenom());
			employe.setPrenom(getString("Nouveau prénom : "));
			});
	}
	
	private Option changerMail(final Employe employe)
	{
		return new Option("Changer le mail", "e", () -> {
			System.out.println("Mail actuel : " + employe.getMail());
			employe.setMail(getString("Nouveau mail : "));
			});
	}
	
	private Option changerPassword(final Employe employe)
	{
		return new Option("Changer le password", "x", () -> {employe.setPassword(getString("Nouveau password : "));});
	}
	

}
