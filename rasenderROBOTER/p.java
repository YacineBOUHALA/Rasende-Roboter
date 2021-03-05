import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class p extends JPanel {
	private static final long serialVersionUID = 1L;
	Image lune, terre, ciel, ocean;

	p() {
		try {
            Random rand = new Random();
            int randomNum = rand.nextInt((4 - 1) + 1) + 1;
            lune = ImageIO.read(new File("C:\\Users\\Yacine\\eclipse-workspace\\proj\\y"+randomNum+".jpg"));
            int randomNu = rand.nextInt((4 - 1) + 1) + 1;
            terre = ImageIO.read(new File("C:\\Users\\Yacine\\eclipse-workspace\\proj\\y"+randomNu+".jpg"));
            int randomN = rand.nextInt((4 - 1) + 1) + 1;
            ciel = ImageIO.read(new File("C:\\Users\\Yacine\\eclipse-workspace\\proj\\y"+randomN+".jpg"));
            int random = rand.nextInt((4 - 1) + 1) + 1;
			ocean = ImageIO.read(new File("C:\\Users\\Yacine\\eclipse-workspace\\proj\\y"+random+".jpg"));
		}
		catch(IOException exc) {
			exc.printStackTrace();
		}
		setPreferredSize(new Dimension(200, 200));
		setBackground(Color.WHITE);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
        g.drawImage(ciel, 0, 0, getWidth()/2, getHeight()/2, this);
        g.drawImage(ocean, getWidth()/2, 0, getWidth()/2, getHeight()/2, this);
        g.drawImage(lune, 0, getHeight()/2,getWidth()/2, getHeight()/2, this);
		g.drawImage(terre, getWidth()/2, getHeight()/2, this);
	}



	public static void main(String[] arg) {
		JFrame fenetre = new JFrame();
                fenetre.setContentPane(new p());
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.pack();
		fenetre.setLocation(100, 100);
		fenetre.setVisible(true);
	}
}