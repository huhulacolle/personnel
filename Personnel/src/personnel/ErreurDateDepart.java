package personnel;

public class ErreurDateDepart extends Exception{
	public ErreurDateDepart()
	{
		System.out.println("La Date d'arriv�e est inf�rieur � la date de d�part");
	}
}


