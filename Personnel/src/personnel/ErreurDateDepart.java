package personnel;

public class ErreurDateDepart extends Exception{
	public ErreurDateDepart()
	{
		System.out.println("Date de départ est inférieur à la date d'arrivée");
	}
}
