package personnel;
import java.time.LocalDate;

public class ErreurDateFin extends Exception{
	public ErreurDateFin(LocalDate dateFin, LocalDate dateDepart){
		System.out.println("La date de fin : " + dateFin + " est inf�rieur � la date d'arriv�e : "+ dateDepart );
		
	}
}
