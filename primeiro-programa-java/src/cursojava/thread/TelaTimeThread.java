package cursojava.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog {

	public TelaTimeThread() {
		// TODO Auto-generated constructor stub
		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		//Primeira parte conclu�da
		
		
		//Sempre ser� o �ltimo comando
		setVisible(true); 
	}
}
