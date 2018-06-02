package vue;

import java.util.Collection;

import javax.swing.table.DefaultTableModel;

import modele.*;

public class ModeleTable extends DefaultTableModel{
	public ModeleTable(Chronologie chrono){
		this.setColumnCount(chrono.getPeriode());
		this.setRowCount(10);
		
		int longueur = chrono.getDateFin().getAnnee() - chrono.getDateDebut().getAnnee();
		int trouver =(int)longueur/chrono.getPeriode();
		int unedate=0;
		String [] tabDate = new String[longueur+1];
		for(int i=0;i<=longueur;i++){
			if ((chrono.getDateDebut().getAnnee()+i) % chrono.getPeriode() == 0){
				unedate = chrono.getDateDebut().getAnnee()+i;
				tabDate[i]=unedate+"";
			}
			else{
				tabDate[i]="";
			}

		}
		this.setColumnIdentifiers(tabDate);
		
	}//Modeletable()

	public Class getColumnClass(int parNum) {
		return Evenement.class;
	}//getColumnClass()

	public boolean isCellEditable(int indiceLigne, int indiceColonne) {
		return false;
	}//isCellEditable()

}//ModeleTable
