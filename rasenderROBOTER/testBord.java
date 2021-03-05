import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class testBord extends JFrame {
	public testBord() {
		Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		int hauteur = (int)tailleEcran.getHeight();
		int largeur = (int)tailleEcran.getWidth();
		Board bord = new Board();
		gameContenent gameCont = new gameContenent();
		bord.setBackground(Color.LIGHT_GRAY);
		this.setTitle("test board");
		this.setSize(largeur, hauteur);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(new BorderLayout());
		this.add(bord, BorderLayout.EAST);
		this.add(gameCont);
	}
	public static void main(String[] args) {
		new testBord();
		
	}

}
