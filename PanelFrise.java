package vue;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.swing.JPanel;

import modele.Chronologie;
import modele.Clavier;
import modele.Data;
import modele.Date;
import modele.ExceptChrono;

public class PanelFrise extends JPanel implements Serializable, ActionListener{
	private CardLayout carte = new CardLayout(5,5);

	public PanelFrise() throws ExceptChrono{
		this.setLayout (carte);

		Date unedate = Date.saisirUneDateDebut();
		Date deuxdates = Date.saisirUneDateFin();
		int periode = 5;
		String titre = new String("Chouette");
		Chronologie chrono = new Chronologie(unedate,deuxdates,periode,titre);
		System.out.println(chrono.toString());
		
		PanelDiapo panelD = new PanelDiapo(chrono);
		PanelTable panelT = new PanelTable(chrono);
		
		PanelFormulaire panelFormulaire = new PanelFormulaire();
		PanelAjout panelAjout = new PanelAjout();

		
		//On associe le panel Diapo et Table pour qu'il
		//soit au mÃªme endroit, dans la mÃªme "page"
		JPanel panelcentre = new JPanel();
		panelcentre.add(panelD,BorderLayout.NORTH);
		panelcentre.add(panelT,BorderLayout.SOUTH);
		
		this.add(panelFormulaire, Data.Titre_Menu[0]);
		this.add(panelcentre,Data.Titre_Menu[1]);
		this.add(panelAjout, Data.Titre_Menu[2]);
		

	}//PanelAgenda()

	@Override
	public void actionPerformed(ActionEvent evt){
		String actionCommand = evt.getActionCommand();
		if (actionCommand.equals(Data.Titre_Menu[3])){
			System.exit(0);
		}
		else {
			for(int i=0;i<Data.Titre_Menu.length-1;i++){
				if (actionCommand.equals(Data.Titre_Menu[i])){
					System.out.println(actionCommand);
					carte.show(this,Data.Titre_Menu[i]);
				}
			}
		}
	}//actionPerformed()
	
}//PanelAgenda
