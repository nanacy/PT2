package vue;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class FenetreMere extends JFrame {
	
	public FenetreMere(String parTitre){
		super(parTitre); 
		// CONTENTPANE
		//PanelFormulaire contentPane = new PanelFormulaire();
		PanelAjout contentPane = new PanelAjout();
		//JPanel contentPane = new JPanel();
		setContentPane(contentPane);
		// PARAMETRES (taille, couleurs, ...)
		contentPane.setBackground(new Color(230,67,98));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 400);
		setVisible(true);
		setLocation(1000,300);

/*
		// LA BARRE DE MENU
		// JMenuBar 
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		setJMenuBar(menuBar);
		// JMenuItem 
		for(int i=0; i<nomPage.length; i++){
			JMenuItem item = new JMenuItem(nomPage[i]);
			
			item.addActionListener((ActionListener) contentPane);
			item.setActionCommand(nomPage[i]);
			
			menuBar.add(item);
		}
*/				
	}//methode FenetreMere
	
	
	// MAIN
	public static void main(String args[]){
		new FenetreMere("Le formulaire de la frise chronologique");
	}//main
	

}//class
