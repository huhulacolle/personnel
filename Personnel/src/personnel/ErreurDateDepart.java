package personnel;

public class ErreurDateDepart extends Exception{
	public ErreurDateDepart()
	{
		System.out.println("Date de d�part est inf�rieur � la date d'arriv�e");
	}
}
