package personnel;
public class ErreurDateFin extends Exception{
	public ErreurDateFin(){
		System.out.println("La date de fin est inf�rieur � la date d'arriv�e");
	}
}
