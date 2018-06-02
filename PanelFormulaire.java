package vue;

import java.awt.GridBagConstraints;

import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import vue.*;

import modele.*;
import vue.*;



public class PanelFormulaire extends JPanel implements ActionListener{
	
	// CHAMPS ----------------------------------------------------------------------------
	String chTitreFrise;
	int chDateDebut;
	int chDateFin;
	int chPeriode;

	
	//CHAMPS FORMULAIRE CREATION FRISE ----------------------------------------------------
	GridBagLayout formulaire_crea = new GridBagLayout();
		//ligne 0
	JLabel titre = new JLabel("FORMULAIRE CREATION FRISE");
		//ligne 1
	JLabel titrefrise = new JLabel("Titre de la frise chronologique");
	JTextField txtfrise = new JTextField(10);
		//ligne 2
	JLabel datedebut = new JLabel("Date de début");
	JTextField txtdatedebut = new JTextField(10);
		//ligne 3
	JLabel datefin = new JLabel("Date de fin");
	JTextField txtdatefin = new JTextField(10);
		//ligne 4
	JLabel intervalle = new JLabel("Intervalle");
	JTextField txtintervalle = new JTextField(10);
		//ligne 5
	JButton buttonAjout = new JButton("+");
	
	JTextField test = new JTextField(10);

	
	// CONSTRUCTEUR --------------------------------------------------------------------------
	public PanelFormulaire(){
		//  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//  !										!
		//  !		 FORMULAIRE CREATION FRISE 		!
		//  !										!
		//  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			
		setLayout(formulaire_crea);
		GridBagConstraints contrainte = new GridBagConstraints();
		contrainte.insets = new Insets(5,5,5,5);
		contrainte.fill = GridBagConstraints.BOTH;
			
		//--------------- LIGNE 0 ---------------
		contrainte.gridy=0;
		add(titre, contrainte);
		//--------------- LIGNE 1 ---------------
		contrainte.gridy=1;
		add(titrefrise, contrainte);
		contrainte.gridx=1; 
		add(txtfrise, contrainte);
		//--------------- LIGNE 2 ---------------
		contrainte.gridy=2;
		// **** COLONNE 0 ****
		contrainte.gridx=0; 
		add(datedebut, contrainte);
		// **** COLONNE 1 ****
		contrainte.gridx=1; 
		contrainte.gridwidth=4;
		add(txtdatedebut, contrainte);
		//--------------- LIGNE 3 ---------------
		contrainte.gridy=3;
		contrainte.gridwidth=1;
		// **** COLONNE 0 ****
		contrainte.gridx=0; 
		add(datefin, contrainte);
		// **** COLONNE 1 ****
		contrainte.gridx=1; 
		contrainte.gridwidth=4;
		add(txtdatefin, contrainte);
		//--------------- LIGNE 4 ---------------
		contrainte.gridy=4;
		contrainte.gridwidth=1;
		// **** COLONNE 0 ****
		contrainte.gridx=0; 
		add(intervalle, contrainte);
		// **** COLONNE 1 ****
		contrainte.gridx=1; 
		add(txtintervalle, contrainte);
		//--------------- LIGNE 5 ---------------
		contrainte.gridy=5;
		// **** COLONNE 0 ****
		contrainte.gridx=0;
		contrainte.gridwidth=2;
		add(buttonAjout, contrainte);
		buttonAjout.addActionListener(this);
		
		
		// TESTTTTTT
		// TESTTTTTT
		contrainte.gridx=0;
		contrainte.gridy=7;
		add(test, contrainte);
		
		//Remise à la normale
		contrainte.gridwidth=1;
		contrainte.gridheight=1;
	}//PanelFormulaire

	
	
	
	// CONTROLEUR  ----------------------------------------------------------------
	public void actionPerformed(ActionEvent parEvt) { 
		if(parEvt.getSource() == buttonAjout){
			chTitreFrise=txtfrise.getText();
			chDateDebut=Integer.parseInt(txtdatedebut.getText());
			chDateFin=Integer.parseInt(txtdatefin.getText());
			chPeriode=Integer.parseInt(txtintervalle.getText());
			
			Date debut = new Date(chDateDebut);
			Date fin = new Date(chDateFin);

			try {
				chrono = new Chronologie(debut, fin, chPeriode, chTitreFrise);
			} catch (ExceptChrono e) {
				e.printStackTrace();
			}
			test.setText(chrono.toString());
		}//if
	}


}//class PanelFormulaire
