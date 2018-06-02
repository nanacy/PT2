package vue;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import modele.*;

public class PanelTable extends JPanel{
	Chronologie chChrono;
	JTable chTable;
	
	public PanelTable(Chronologie parChrono) {
		chChrono=parChrono;
		chTable= new JTable();
		chTable.setModel(new ModeleTable(chChrono));
		
		JScrollPane scroll = new JScrollPane(chTable);
		chTable.setRowHeight(40);
		chTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		this.add(scroll);
		
	}//PanelAffichage()

}//PanelAffichage
