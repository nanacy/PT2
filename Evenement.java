package modele;

import java.io.Serializable;

public class Evenement implements Serializable{
	private Date chDate;
	private String chTitre, chTexte;
	private int chPoids;
	private static int chNbEvt = 0;

	
	public Evenement (Date parDate, String parTitre, String parTexte, int parPoids) {
		chDate = parDate;
		chTitre = parTitre;
		chTexte = parTexte;
		chPoids = parPoids;
		chNbEvt++;
	}//Evenement()
	
	public String toString() {
		return "Le " + chDate.toString() + ", a pour titre " + chTitre + "  et a comme texte " + chTexte;
	}//toString()
	
	
	
	public String getTitre() {
		return chTitre;
	}//getTitre()
	public String getTexte() {
		return chTexte;
	}//getTexte()
	public int getPoids() {
		return chPoids;
	}//getPoids()
	public Date getDate(){
		return chDate;
	}//getDate()
	
	public void setTitre (String parTitre) {
		parTitre = chTitre;
	}//setTitre()
	
	
	
	public int getNbEvt() {
		return chNbEvt;
	}//getNbEvt()
	
//	public static Evenement lireEvenement() {
//		System.out.println("Entrez une date :");
//		Date dateEvt = Date.saisirUneDateDebut();
//		System.out.print("Entrez un titre : ");
//		String titreEvt = Clavier.lireString();
//		System.out.print("Entrez un texte : ");
//		String lieuEvt = Clavier.lireString();
//		return new Evenement (dateEvt, titreEvt, lieuEvt);
//	}//lireEvenement()
	
	public int compareTo (Evenement parEvt) {
		if(chDate.compareTo(parEvt.chDate) != 0)
			return chDate.compareTo(parEvt.chDate);
		else
			return chTitre.compareTo(parEvt.chTitre);
	}//compareTo()
	

}
