package personnel;

public class ErreurDateFin extends Exception{
	public ErreurDateFin(){
		System.out.println("La date de départ est inférieur à la date d'arrivée");
	}
}
