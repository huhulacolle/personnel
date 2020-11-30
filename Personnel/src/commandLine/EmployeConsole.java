package commandLine;

import static commandLineMenus.rendering.examples.util.InOut.getString;

import java.time.LocalDate;

import commandLineMenus.ListOption;
import commandLineMenus.Menu;
import commandLineMenus.Option;
import personnel.Employe;
import personnel.ErreurDateDepart;
import personnel.ErreurDateFin;

public class EmployeConsole 
{
	private Option afficher(final Employe employe)
	{
		return new Option("Afficher l'employ�", "l", () -> {System.out.println(employe);});
	}

	ListOption<Employe> editerEmploye()
	{
		return (employe) -> editerEmploye(employe);		
	}

	Option editerEmploye(Employe employe)
	{
			Menu menu = new Menu("G�rer le compte " + employe.getNom(), "c");
			menu.add(afficher(employe));
			menu.add(changerNom(employe));
			menu.add(changerPrenom(employe));
			menu.add(changerMail(employe));
			menu.add(changerPassword(employe));
			menu.add(changerDateDebut(employe));
			menu.add(changeDateFin(employe));
			menu.add(SupprimerEmploye(employe));
			menu.addBack("q");
			return menu;
	}
	
	private Option SupprimerEmploye(final Employe employe)
	{
		return new Option("Supprimer un employe", "s", () -> {
			employe.remove();
			});
	}

	private Option changeDateFin(final Employe employe) {
		return new Option("Changer Date d�part", "f", 
				() -> {
					try {
						System.out.println("Date de d�part actuel : " + employe.getDateFin());
						employe.setDateFin((LocalDate)LocalDate.parse(getString("Nouvelle Date de d�part : ")));
					}catch (ErreurDateFin f)
					{
						changeDateFin(employe);
					}
					}
			);
	}

	private Option changerDateDebut(final Employe employe) {
		return new Option("Changer Date d'arriv�e", "d", 
				() -> {
					try {
						System.out.println("Date d'arriv�e actuel : " + employe.getDateDebut());
						employe.setDateDebut((LocalDate)LocalDate.parse(getString("Nouvelle Date d'arriv�e :")));
					} catch (ErreurDateDepart e) {
						changerDateDebut(employe);
					}
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
		return new Option("Changer le pr�nom", "p", () -> {
			System.out.println("Pr�nom actuel : " + employe.getPrenom());
			employe.setPrenom(getString("Nouveau pr�nom : "));
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
