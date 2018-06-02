package modele;

import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Date implements Comparable <Date>, Serializable {
  private int chAnnee;
  
  public Date (){ 
	  GregorianCalendar dateAuj = new GregorianCalendar ();
	  chAnnee = dateAuj.get (Calendar.YEAR);
  }//Date()

  public Date (int parAnnee)   {   
	chAnnee = parAnnee; 			
  }//Date() 
   
  /**
   * retourne 0 si this et parDate sont �gales, 
   * -1 si this pr�c�de parDate,
   *  1 si parDate pr�c�de this
   */

  public int compareTo (Date parDate) {
    if (chAnnee < parDate.chAnnee)
		return -1;
	if (chAnnee > parDate.chAnnee)
		return 1;
	return 0;	
  }//compareTo()

	public static int lireDate() {
		return Clavier.lireInt();
	}//lireDate()

	
	public static Date saisirUneDateDebut(){
		System.out.print("Entrez l'année de début: ");
		int An = lireDate();
		return new Date(An);
	}//saisirUneDate()
	
	public static Date saisirUneDateFin(){
		System.out.print("Entrez l'année de fin: ");
		int An = lireDate();
		return new Date(An);
	}//saisirUneDate()
	

	
//	public Date dateDuLendemain ()   {	
//	    if (jour < dernierJourDuMois(mois,annee))
//			     return  new Date (jour+1,mois,annee);
//		else if (mois < 12)
//				return new Date (1,mois+1,annee);
//		else 
//				return new Date (1,1,annee+1);	
//	}//dateDuLendemain() 
//  
//	
//
//	
//  public Date dateDeLaVeille () {    
//	if (jour > 1)
//			return  new Date (jour-1,mois,annee);
//	else if (mois > 1)
//			   return new Date (Date.dernierJourDuMois(mois-1, annee),mois-1,annee);
//		 else return  new Date (31,12,annee-1);
//  }//dateDeLaVeille
  

  public static int dernierJourDuMois (int parMois, int parAnnee) {
		switch (parMois) {
			 case 2 : if (estBissextile (parAnnee))  return 29 ; else return 28 ;  
			 case 4 : 	 case 6 : 	 case 9 : 	 case 11 : return 30 ;
			 default : return 31 ;
			}  // switch
  }//dernierJourDuMois() 
  
  
  private static boolean estBissextile(int parAnnee) {
			return parAnnee % 4 == 0 && (parAnnee % 100 != 0 || parAnnee % 400 == 0);
  }//estBissextile()
  
  public String toString(){
	  String chaine = new String();
	  chaine += chAnnee;
	  return chaine;
  }
//  public String toString () {
//    String chaine = new String();
//    switch (jourSemaine) {
//		 case 1: chaine = "dimanche"; break;
//		 case 2: chaine = "lundi"; break;
//		 case 3: chaine = "mardi"; break;
//		 case 4: chaine = "mercredi"; break;
//		 case 5: chaine = "jeudi"; break;
//		 case 6: chaine = "vendredi"; break;
//		 case 7: chaine = "samedi"; break;
//		}
//	chaine += " " + jour + " ";
//	switch (mois) {
//		 case 1: chaine += "janvier"; break;
//		 case 2: chaine += "fevrier"; break;
//		 case 3: chaine += "mars"; break;
//		 case 4: chaine += "avril"; break;
//		 case 5: chaine += "mai"; break;
//		 case 6: chaine += "juin"; break;
//		 case 7: chaine += "juillet"; break;
//		 case 8: chaine += "aout"; break;
//		 case 9: chaine += "septembre"; break;
//		 case 10: chaine += "octobre"; break;
//		 case 11: chaine += "novembre"; break;
//		 case 12: chaine += "decembre"; break;
//		}	
//	return chaine;
//  	}//toString()  


	public int getAnnee() { 
		return chAnnee;
	}//getAnnee()
	

//	public int getJour() { 
//		return jour;
//	}//getJour()
//
//
//	public int getMois() { 
//		return mois;
//	}//getMois()
//
//
//	public int getJourSemaine () {
//		return jourSemaine;
//	}//getJourSemaine()


//	public Date datePremierJourSemaine () {
//		Date datePrem = this;	 
//		while (datePrem.getJourSemaine()!=2) {
//			datePrem = datePrem.dateDeLaVeille();
//		}
//		return datePrem;
//	}//datePremierJourSemaine()

	
	public boolean isToday() {
		return new Date().compareTo(this) == 0;
	}//isToday()
}  // class Date