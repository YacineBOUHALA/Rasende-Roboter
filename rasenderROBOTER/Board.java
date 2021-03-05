import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Board extends JPanel {
	
	private JPanel panel1;
	private JPanel buttPanel;
	private JPanel timerPanel;
	private JPanel IconLoding;
	private JPanel RobotLoding;
	private JPanel Players;
	private JLabel label;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	public JButton Exit;
	private JButton resetGame;
	private JButton gotIt;

	private JLabel gameTime;
	private JLabel TimeOut;
	private JLabel iconLabel;
	private JLabel rebotLabel;
	private JLabel iconSet;
	private JLabel robotSet;
	private JLabel player1;
	private JLabel player2;
	private JLabel player3;
	private JLabel player4;
	private JTextField gTime;
	private JTextField tOut;
	
	private ImageIcon icon;
	private ImageIcon Robot;
	private ImageIcon game;
	
	public Board() {
		
		label = new JLabel("");
		label1 = new JLabel("");
		label2 = new JLabel("");
		label3 = new JLabel("");
		player1 = new JLabel("Player 1: ");
		player2 = new JLabel("Player 2: ");
		player3 = new JLabel("Player 3: ");
		player4 = new JLabel("Player 4: ");
		
		panel1 = new JPanel();
		buttPanel = new JPanel();
		timerPanel = new JPanel();
		IconLoding = new JPanel();
		RobotLoding = new JPanel();
		Players = new JPanel();
		
		Exit = new JButton("EXIT");
		Exit.setForeground(Color.RED);
		Exit.setBorder(BorderFactory.createLineBorder(Color.red));
		Exit.setPreferredSize(new Dimension(10,10));
		Exit.setBorder(new RoundBtn(15));
		
		
		resetGame = new JButton("Reset Game");
		resetGame.setForeground(Color.green);
		resetGame.setBorder(new RoundBtn(15));
		
		
		gotIt = new JButton("Got it !");
		gotIt.setForeground(Color.BLUE);
		gotIt.setBorder(BorderFactory.createLineBorder(Color.blue));
		gotIt.setBorder(new RoundBtn(15));
		//resetGame.setBorder(BorderFactory.createLineBorder(Color.green));
		
		gameTime = new JLabel("Game Time :");
		TimeOut = new JLabel("Time Remining :");
		gTime = new JTextField("5 Min");
		tOut = new JTextField("60 Sec");
		iconLabel = new JLabel("Target: ");
		rebotLabel = new JLabel("rebot: ");
		
		icon = new ImageIcon("C:\\Users\\ghiles\\Desktop\\target-yellow-square.png");
		iconSet = new JLabel(icon, JLabel.CENTER);
		iconSet.setPreferredSize(new Dimension(30,30));
		Robot = new ImageIcon("C:\\Users\\ghiles\\Desktop\\robot-blue.png");
		robotSet = new JLabel(Robot, JLabel.CENTER);
		robotSet.setPreferredSize(new Dimension(30,45));

		this.setSize(60, 400);
		
		buttPanel.setBackground(Color.DARK_GRAY);
		buttPanel.setLayout(new GridLayout(1,2));
		buttPanel.add(Exit);
		buttPanel.add(resetGame);
		
		timerPanel.setLayout(new GridLayout(2,2));
		timerPanel.add(gameTime);
		timerPanel.add(gTime);
		timerPanel.add(TimeOut);
		timerPanel.add(tOut);
		
		IconLoding.setLayout(new GridLayout(1,2));
		IconLoding.add(iconLabel);
		IconLoding.add(iconSet);
		RobotLoding.setLayout(new GridLayout(1,2));
		RobotLoding.add(rebotLabel);
		RobotLoding.add(robotSet);
				
		Players.setLayout(new GridLayout(4,1));
		Players.add(player1);
		Players.add(player2);
		Players.add(player3);
		Players.add(player4);
		
		panel1.setBackground(Color.LIGHT_GRAY);
		panel1.setLayout(new GridLayout(10,1));
		panel1.add(buttPanel);
		panel1.add(label);
		panel1.add(timerPanel);
		panel1.add(label1);
		panel1.add(IconLoding);
		panel1.add(RobotLoding);
		panel1.add(label2);
		panel1.add(Players);
		panel1.add(label3);
		panel1.add(gotIt);
		
		
		this.add(panel1);
		
		
	}	
}
