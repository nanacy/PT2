package vue;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modele.*;
import vue.*;


public class PanelAjout extends JPanel implements ActionListener{
	
	// CHAMPS
	Date chDateEvt;
	String chTitreEvt;
	String chTexteEvt;
	int chPoid;
	
	// CHAMPS AJOUT EVENEMENT --------------------------------------------------------------
	GridBagLayout formulaire_ajout = new GridBagLayout();
		//ligne 0
	JLabel titreevt = new JLabel("FORMULAIRE AJOUT EVENEMENT");
		//ligne 2
	JLabel date = new JLabel("Date de l'evenement");
	JTextField txtJour = new JTextField(10);
	JTextField txtMois = new JTextField(10);
	JTextField txtAnnee= new JTextField(10);
		//ligne 3
	JLabel titre = new JLabel("Titre de l'evenement");
	JTextField txt_titre = new JTextField(10);
		//ligne 4
	JLabel texte = new JLabel("Texte de l'evenement");
	JTextField txt_texte = new JTextField(10);
		//ligne 5
	JLabel poid = new JLabel("Poid de l'évenement");
	String itemPoid[]= {"1","2","3","4"}; 
	JComboBox boxPoid = new JComboBox(itemPoid);
		//ligne 6
	JButton buttonAjout2 = new JButton("+");

	
	public PanelAjout(){
		
		//jour / mois / annee
		txtJour.setText("Jour"); txtMois.setText("Mois"); txtAnnee.setText("Annee");
		
		//  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//  !										!
		//  !		 FORMULAIRE AJOUT EVT	 		!
		//  !										!
		//  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			
		setLayout(formulaire_ajout);
		GridBagConstraints contrainte = new GridBagConstraints();
		contrainte.fill = GridBagConstraints.BOTH;
			
		//--------------- LIGNE 0 ---------------
		contrainte.gridy=0;
		contrainte.gridwidth=3;
		contrainte.insets = new Insets(25,25,25,25);
		add(titreevt, contrainte);
		contrainte.insets = new Insets(5,5,5,5);
		contrainte.gridwidth=1;
		//--------------- LIGNE 2 ---------------
		contrainte.gridy=2;
		// **** COLONNE 0 ****
		contrainte.gridx=0; 
		add(date, contrainte);		
		// **** COLONNE 1 ****
		contrainte.gridx=1; 
		add(txtJour, contrainte);
		// **** COLONNE 2 ****
		contrainte.gridx=2;
		add(txtMois, contrainte);
		// **** COLONNE 3 ****
		contrainte.gridx=3;
		add(txtAnnee, contrainte);
		//--------------- LIGNE 3 ---------------
		contrainte.gridy=3;
		contrainte.gridwidth=1;
		// **** COLONNE 0 ****
		contrainte.gridx=0; 
		add(titre, contrainte);
		// **** COLONNE 1&2&3&4 ****
		contrainte.gridx=1; 
		contrainte.gridwidth=3;
		add(txt_titre, contrainte);		
		//--------------- LIGNE 4 ---------------
		contrainte.gridy=4;
		contrainte.gridwidth=1;
		// **** COLONNE 0 ****
		contrainte.gridx=0; 
		add(texte, contrainte);
		// **** COLONNE 1&2&3&4 ****
		contrainte.gridx=1; 
		contrainte.gridwidth=3;
		add(txt_texte, contrainte);
		//--------------- LIGNE 5 ---------------
		// **** COLONNE 0 ****
		contrainte.gridx=0;
		contrainte.gridy=5;
		contrainte.gridwidth=1;
		add(poid, contrainte);
		// **** COLONNE 1 ****
		contrainte.gridx=1;
		add(boxPoid, contrainte);
		//--------------- LIGNE 6 ---------------
		contrainte.gridy=6;
		// **** COLONNE 3 ****
		contrainte.gridx=3;
		add(buttonAjout2, contrainte);
		
		//Remise à la normale
		contrainte.gridwidth=1;
		contrainte.gridheight=1;
	}//PanelAjout



	@Override
	public void actionPerformed(ActionEvent parEvt) {
		if(parEvt.getSource() == buttonAjout2){
			//chDateEvt=txt_date.getAnnee();
			chTitreEvt=txt_titre.getText();
			chTexteEvt=txt_texte.getText();
		}
		
	}
	
	
}//Class
