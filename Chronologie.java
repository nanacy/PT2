package modele;

import java.util.Collection;
import java.util.TreeSet;

import modele.*;

public class Chronologie {
	private String chTitreFrise;
	private Date chDateDebut;
	private Date chDateFin;
	private int chPeriode;
	private Collection<Evenement> chEvenement;
	
	public Chronologie(Date parDateDebut, Date parDateFin, int parPeriode, String parTitreFrise)throws ExceptChrono{
		if (parDateDebut.compareTo(parDateFin) > 0){
			throw new ExceptChrono("Les Dates ne sont pas valides");
		}
		if (parPeriode ==0){
			throw new ExceptChrono("La p�riode est nulle, cela n'est pas possible");
		}
		chTitreFrise= parTitreFrise;
		chDateDebut=parDateDebut;
		chDateFin=parDateFin;
		chPeriode=parPeriode;
		chEvenement= new TreeSet<Evenement>();
	}//Chronologie()
	
	public String toString(){
		String chaine = chTitreFrise +" ~ La période s'étend de " + chDateDebut + " à " +chDateFin + " avec une période de " +chPeriode;
		return chaine;
	}//toString()
	
	
	public void ajout (Evenement parEvt) {
		System.out.println(parEvt);		
        chEvenement.add(parEvt);
	}//ajout()	    	
	
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
