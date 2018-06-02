package vue;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import modele.Chronologie;


public class PanelDiapo extends JPanel implements ActionListener{
	private int chPosition; // champs permettant de suivre le mouvement des diaporamas
	
	
	//Champs pour mettre en place les images ainsi que les intitulés des images
	private File repertoire = new File("images"); //les images prises sont des dés allant de 1 à 3
	private String [] NomPrenom = {"AnnePetit","BiduleDupont","JeanJardin"};
	private String [] infoFiche={"Anne Petit, Commercial, entrée en 2011","Bidule Dupont, Administration, entré en 2010","Jean Jardin, Etude et Developpement, entré en 2006"};
	private JLabel [] chlabel = new JLabel[infoFiche.length];


	//Création des différents boutons
	private String [] chTitreBoutons={"<",">"};
	private JButton [] chBoutons = new JButton [chTitreBoutons.length];
	
	//On gère la page généralement à travers un BorderLayout
	private BorderLayout cartes = new BorderLayout(5,5);
	//Mais on gère le diaporama avec un CardLayout
	private CardLayout gestionCartes = new CardLayout(5,5);
	
	//Le panel Centre correspond au CardLayout, donc à l'affichage des images et de l'intitulé des images
	private JPanel panelCentre = new JPanel();
	

	public PanelDiapo(Chronologie parChrono){
		this.setLayout(cartes); //On utilise un BorderLayout pour gérer la fiche Salarie

		//Panel Nord pour mettre en place le titre de la frise
		JPanel panelNord = new JPanel();
		
		panelNord.setOpaque(true);
		panelNord.setLayout(gestionCartes);
		add(panelNord,BorderLayout.NORTH);
		JLabel label = new JLabel(parChrono.getTitreFrise());
		panelNord.add(label);

		
		//PanelCentre pour gérer le diaporama
		panelCentre.setOpaque(true);
		panelCentre.setLayout(gestionCartes);
		add(panelCentre,BorderLayout.CENTER);

		//On affichage l'image ainsi que son intitulé dans le panelCentre
		for(int indice=0;indice<infoFiche.length;indice++){
			chlabel[indice]=new JLabel (infoFiche[indice],new ImageIcon("images"+File.separator+NomPrenom[indice]+".jpg"),JLabel.CENTER);
			panelCentre.add(chlabel[indice],infoFiche[indice]);
			panelCentre.add(chlabel[indice],parChrono.getTitreFrise());

		}
		gestionCartes.show(panelCentre, infoFiche[chPosition]);

		
		//PanelSud == Affichage des boutons, du texte en bas et du bouton recherche
		JPanel panelSud = new JPanel (); //Création du panel Sud
		panelSud.setOpaque(true);
		add (panelSud, BorderLayout.SOUTH);
		
		
		 //Mise en place des deux boutons dans la section sud de la page
		for(int indice=0;indice<chBoutons.length;indice++){
			chBoutons[indice]=new JButton(chTitreBoutons[indice]);
			chBoutons[indice].addActionListener(this);
			panelSud.add(chBoutons[indice]);
		}

	}//FicheSalarie()
	
	public void actionPerformed(ActionEvent parEvt){ //Méthode permettant de naviguer entre les pages grâce aux boutons
		if (parEvt.getSource() == chBoutons[1]){ //Si on clique sur le bouton avancer
			if (chPosition == 2)
				chPosition = 0;
			else
				chPosition++;
			gestionCartes.next(panelCentre);
		}

		else if (parEvt.getSource() == chBoutons[0]){ //Si on clique sur le bouton reculer
			if (chPosition == 0)
				chPosition = 2;
			else
				chPosition--;
			gestionCartes.show(panelCentre,infoFiche[chPosition]);
		}
		
	}//actionPerfomed()
}//FicheSalarie	

