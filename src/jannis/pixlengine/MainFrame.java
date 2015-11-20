package jannis.pixlengine;

import jannis.pixlengine.world.Field;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import nj.main.Constants;

/**
 * @author Jannis and Nicolas
 */
public class MainFrame extends JFrame {
	
	private JPanel panel;
	
	/**
	 * General constructor
	 */
	public MainFrame(String title) {
		super();
		
		// ends java program on window close event
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// sets the frame's title
		this.setTitle(title);

		// set bounds
		this.setBounds(500, 200, 800, 450);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setResizable(false);
		
		// make most important windows eva
		this.setAlwaysOnTop(true);
		
		// Make background black
		panel = new JPanel();
		panel.setBounds(0, 0, 800, 450);
		panel.setBackground(Color.BLACK);
		getContentPane().add(panel);
	}
	
	public void showStuff() {
		Field f = new Field();
		ArrayList<ImageIcon> icons = f.getIcons();
		
		for (ImageIcon icon : icons) {
			JLabel imgLabel = new JLabel();
			imgLabel.setIcon(icon);
			panel.add(imgLabel);
			imgLabel.setBounds(1, 1, 32, 32);
			imgLabel.setVisible(true);
		}
	}

}
