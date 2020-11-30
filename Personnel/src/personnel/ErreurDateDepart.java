package personnel;

public class ErreurDateDepart extends Exception{
	public ErreurDateDepart()
	{
		System.out.println("La Date d'arrivée est inférieur à la date de départ");
	}
}


