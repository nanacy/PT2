package modele;

import java.util.Collection;

import modele.*;

public class Chronologie {
	private String chTitreFrise;
	private Date chDateDebut;
	private Date chDateFin;
	private int chPeriode;
	private Collection<Evenement> chEvenement;
	//Treeset
	
	public Chronologie(Date parDateDebut, Date parDateFin, int parPeriode, String parTitreFrise)throws ExceptChrono{
		if (parDateDebut.compareTo(parDateFin) > 0){
			throw new ExceptChrono("Les Dates ne sont pas valides");
		}
		if (parPeriode ==0){
			throw new ExceptChrono("La période est nulle, cela n'est pas possible");
		}
		chTitreFrise= parTitreFrise;
		chDateDebut=parDateDebut;
		chDateFin=parDateFin;
		chPeriode=parPeriode;
	}//Chronologie()
	
	public String toString(){
		String chaine = chTitreFrise +" ~ La période s'étend de " + chDateDebut + " à " +chDateFin + " avec une période de " +chPeriode;
		return chaine;
	}
	
	public String getTitreFrise() { 
		return chTitreFrise;
	}//getTitreFrise()
	
	public Date getDateDebut() { 
		return chDateDebut;
	}//getDateDebut()
	

	public Date getDateFin() { 
		return chDateFin;
	}//getDateFin()


	public int getPeriode() { 
		return chPeriode;
	}//getPeriode()

}
