package personnel;

public class ErreurDateFin extends Exception{
	public ErreurDateFin(){
		System.out.println("La date de d�part est inf�rieur � la date d'arriv�e");
	}
}
