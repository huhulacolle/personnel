package personnel;
public class ErreurDateFin extends Exception{
	public ErreurDateFin(){
		System.out.println("La date de fin est inférieur à la date d'arrivée");
	}
}
