package vue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import modele.Data;
import modele.ExceptChrono;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;


public class FenetreFrise extends JFrame{
	public FenetreFrise (String parTitre) throws ExceptChrono{
		super(parTitre);
		PanelFrise contentPane = new PanelFrise();
		setContentPane(contentPane);
		contentPane.setBackground(new Color (230,67,98));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,200);
		setVisible(true);
		setLocation(200,300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.setJMenuBar(menuBar);
		for(int i=0;i<Data.Titre_Menu.length;i++){
			if (i !=2){
				JMenuItem menu = new JMenuItem (Data.Titre_Menu[i],Data.Titre_Menu[i].charAt(0));
				menu.setAccelerator(KeyStroke.getKeyStroke(Data.Titre_Menu[i].charAt(0),java.awt.Event.CTRL_MASK));
				menu.addActionListener((ActionListener) contentPane);
				menu.setActionCommand(Data.Titre_Menu[i]);
				menuBar.add(menu);
			}
			else{
				JMenuItem menu = new JMenuItem (Data.Titre_Menu[i],Data.Titre_Menu[i].charAt(1));
				menu.setAccelerator(KeyStroke.getKeyStroke(Data.Titre_Menu[i].charAt(1),java.awt.Event.CTRL_MASK));
				menu.addActionListener((ActionListener) contentPane);
				menu.setActionCommand(Data.Titre_Menu[i]);
				menuBar.add(menu);
			}
		}
	}//FenetreMere()
	
	public static void main (String []args) throws ExceptChrono{
		new FenetreFrise("Fenetre Frise");
	}// main()	
}//FenetreAgenda
